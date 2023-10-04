#include <opencv2/opencv.hpp>
#include <iostream>
using namespace std;
using namespace cv;

/* 카메라의 속성을 설정하는 방법
void setCamera() {
	capture.set(CAP_PROP_FRAME_WIDTH, 400);
	capture.set(CAP_PROP_FRAME_HEIGHT, 300);
	capture.set(CAP_PROP_AUTOFOCUS, 0);
	capture.set(CAP_PROP_BRIGHTNESS,150);

	int zoom=
}
*/

int main() {
	VideoCapture capture(0);
	if (!capture.isOpened()) {
		cout << "카메라 연결 x" << endl;
		exit(1);
	}
	cout << "너비" << capture.get(CAP_PROP_FRAME_WIDTH) << endl;
	cout << "높이" << capture.get(CAP_PROP_FRAME_HEIGHT) << endl;
	cout << "노출" << capture.get(CAP_PROP_EXPOSURE) << endl;
	cout << "밝기" << capture.get(CAP_PROP_BRIGHTNESS) << endl;

	for (;;) {
		Mat frame;
		//capture.read(frame);
		capture >> frame;     //frame에 한 프레임 담기
			
		imshow("카메라 영상 보기", frame);
		if (waitKey(30) >= 0) 
			break;
	}
}