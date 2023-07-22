const quotes = [
  {
    quotes: `"They must often change who would be constant in happiness or wisdom."`,
    author: "Confucius",
  },
  {
    quotes: `"Age is no guarantee of maturity."`,
    author: "Lawana Blackwell",
  },
  {
    quotes: `"You will face many defeats in life, but never let yourself be defeated."`,
    author: "Maya Angelou",
  },
  {
    quotes: `"The greatest glory in living lies not in never falling, but in rising every time we fall."`,
    author: "Nelson Mandela",
  },
  {
    quotes: `"Life is either a daring adventure or nothing at all."`,
    author: "Helen Keller",
  },
  {
    quotes: `"This too shall pass."`,
    author: "Et hoc transibit",
  },
  {
    quotes: `"The die is cast."`,
    author: "Julius caesar",
  },
  {
    quotes: `"Life is a mountain. Your goal is to find your path, not to reach the top."`,
    author: "Maxime Lagacé",
  },
  {
    quotes: `"The two most important days in your life are the day you are born and the day you find out why."`,
    author: "Mark Twain",
  },
  {
    quotes: `"Change the world by being yourself."`,
    author: "Amy Poehler",
  },
];

const quote = document.querySelector("#quote span:first-child");
const author = document.querySelector("#quote span:last-child");

const todaysQuote = quotes[Math.floor(Math.random() * quotes.length)];

quote.innerText = todaysQuote.quotes;
author.innerText = todaysQuote.author;

// Math
// Math.round, Math.random, Math.ceil, Math.floor()
// Array.length  어레이의 길이
