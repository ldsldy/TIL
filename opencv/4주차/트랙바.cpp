#include <opencv2/opencv.hpp>
#include <iostream>
using namespace std;
using namespace cv;

string title = "트랙바 이벤트";
Mat image, dst;

void onChange(int Threshold, void* userdata) {
	Point pt;
	for(pt.y=0;pt.y<image.rows;pt.y++)
		for (pt.x = 0; pt.x < image.cols; pt.x++) {
			if (image.at<uchar>(pt.y, pt.x) < Threshold)
				dst.at<uchar>(pt.y, pt.x) = 0;
			else
				dst.at<uchar>(pt.y, pt.x) = 255;
		}
	imshow(title, dst);
}

//빨간색 r값 찾아내기
int pickColor(int Threshold, void* userdata) {	//트랙바 변경값
	Point pt;
	Vec3b pxl;
	for (pt.y = 0; pt.y < image.rows; pt.y++) {
		pxl = image.at<Vec3b>(pt.y, pt.x);		//bgr값
		uchar tval = (uchar)(0.11 * pxl[0] + 0.59 * pxl[1] + 0.3 * pxl[2]);
		if (pxl[2] > Threshold && pxl[2] > 1.9 * pxl[1]
			&& pxl[2] > 1.9 * pxl[0])
			dst.at<Vec3b>(pt.y, pt.x) = Vec3b(0, 0, 255);
		else
			dst.at<Vec3b>(pt.y, pt.x) = Vec3b(tval, tval, tval);
		imshow(title, dst);

	}
}

int main() {
	int pos = 128;
	image = imread("ryu.jpg", IMREAD_GRAYSCALE);
	dst = Mat(size(image), CV_8U, Scalar(255));

	namedWindow(title, WINDOW_AUTOSIZE);
	createTrackbar("밝기값", title, &pos, 255, onChange);; //트랙바이름, 창이름,트랙바 변경값, 트랙바 최댓값, 함수 
	imshow("입력영상", image);
	waitKey(0);

	return 0;
}