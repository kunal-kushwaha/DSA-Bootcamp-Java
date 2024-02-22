"use strict";
function pattern1(n) {
  let outputString = "";
  for (let row = 1; row <= n; row++) {
    for (let column = 1; column <= n; column++) {
      outputString += "*";
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern2(n) {
  let outputString = "";
  for (let row = 1; row <= n; row++) {
    for (let column = 1; column <= row; column++) {
      outputString += "*";
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern3(n) {
  let outputString = "";
  for (let row = 1; row <= n; row++) {
    for (let column = 1; column <= n - row + 1; column++) {
      outputString += "*";
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern4(n) {
  let outputString = "";
  for (let row = 1; row <= n; row++) {
    for (let column = 1; column <= row; column++) {
      outputString += column;
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern5(n) {
  let outputString = "";
  for (let row = 1; row <= 2 * n - 1; row++) {
    const noOfColumns = row <= n ? row : n - (row % n);
    for (let column = 1; column <= noOfColumns; column++) {
      outputString += "*";
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern6(n) {
  let outputString = "";
  for (let row = 1; row <= n; row++) {
    for (let space = 1; space <= n - row; space++) {
      outputString += " ";
    }
    for (let column = 1; column <= row; column++) {
      outputString += "*";
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern7(n) {
  let outputString = "";
  for (let row = 1; row <= n; row++) {
    for (let space = 1; space <= row - 1; space++) {
      outputString += " ";
    }
    for (let column = 1; column <= n - row + 1; column++) {
      outputString += "*";
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern8(n) {
  let outputString = "";
  for (let row = 1; row <= n; row++) {
    for (let space = 1; space <= n - row; space++) {
      outputString += " ";
    }
    for (let column = 1; column <= row * 2 - 1; column++) {
      outputString += "*";
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern9(n) {
  let outputString = "";
  for (let row = 1; row <= n; row++) {
    for (let space = 1; space <= row - 1; space++) {
      outputString += " ";
    }
    for (let column = 1; column <= (n - row + 1) * 2 - 1; column++) {
      outputString += "*";
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern10(n) {
  let outputString = "";
  for (let row = 1; row <= n; row++) {
    for (let space = 1; space <= n - row; space++) {
      outputString += " ";
    }
    for (let column = 1; column <= row * 2 - 1; column++) {
      outputString += column % 2 === 0 ? " " : "*";
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern11(n) {
  let outputString = "";
  for (let row = 1; row <= n; row++) {
    for (let space = 1; space <= row - 1; space++) {
      outputString += " ";
    }
    for (let column = 1; column <= (n - row + 1) * 2 - 1; column++) {
      outputString += column % 2 === 0 ? " " : "*";
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern12(n) {
  let outputString = "";
  for (let row = 1; row <= n * 2; row++) {
    const noOfSpaces = row <= n ? row - 1 : n - (row - n);
    for (let space = 1; space <= noOfSpaces; space++) {
      outputString += " ";
    }
    const noOfColumns = row <= n ? (n - row + 1) * 2 - 1 : (row - n) * 2 - 1;
    for (let column = 1; column <= noOfColumns; column++) {
      outputString += column % 2 === 0 ? " " : "*";
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern13(n) {
  let outputString = "";
  for (let row = 1; row <= n; row++) {
    for (let space = 1; space <= n - row; space++) {
      outputString += " ";
    }
    const noOfColumns = row * 2 - 1;
    for (let column = 1; column <= noOfColumns; column++) {
      outputString +=
        column === 1 || column === noOfColumns || row === n ? "*" : " ";
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern14(n) {
  let outputString = "";
  for (let row = 1; row <= n; row++) {
    for (let space = 1; space <= row - 1; space++) {
      outputString += " ";
    }
    const noOfColumns = (n - row + 1) * 2 - 1;
    for (let column = 1; column <= noOfColumns; column++) {
      outputString +=
        column === 1 || column === noOfColumns || row === 1 ? "*" : " ";
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern15(n) {
  let outputString = "";
  const noOfRows = n * 2 - 1;
  for (let row = 1; row <= noOfRows; row++) {
    const noOfSpaces = row <= 5 ? n - row : row - n;
    for (let space = 1; space <= noOfSpaces; space++) {
      outputString += " ";
    }
    const noOfColumns = row <= n ? row * 2 - 1 : (n - (row - n)) * 2 - 1;
    for (let column = 1; column <= noOfColumns; column++) {
      outputString += column === 1 || column === noOfColumns ? "*" : " ";
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern16(n) {
  let outputString = "";
  let previousRow = [];
  let currentItem;
  for (let row = 1; row <= n; row++) {
    let currentRow = [];
    const noOfSpaces = (n - row) * 2;
    for (let space = 1; space <= noOfSpaces; space++) {
      outputString += " ";
    }
    for (let column = 1; column <= row; column++) {
      if (!previousRow[column - 2] || !previousRow[column - 1]) {
        currentItem = 1;
      } else {
        currentItem = previousRow[column - 2] + previousRow[column - 1];
      }
      currentRow.push(currentItem);
      outputString += currentItem + "   ";
    }
    outputString += "\n";
    previousRow = currentRow;
  }
  console.log(outputString);
}

function pattern17(n) {
  let outputString = "";
  const noOfRows = n * 2 - 3;
  for (let row = 1; row <= noOfRows; row++) {
    const noOfSpaces = row <= n - 1 ? n - 1 - row : row - (n - 1);
    for (let space = 1; space <= noOfSpaces; space++) {
      outputString += " ";
    }
    const noOfColumns =
      row <= n - 1 ? row * 2 - 1 : noOfRows - (row - (n - 1)) * 2;
    for (let column = 1; column <= noOfColumns; column++) {
      const middleColumnNo = Math.ceil(noOfColumns / 2);
      outputString +=
        column <= middleColumnNo
          ? middleColumnNo - (column - 1)
          : column - (middleColumnNo - 1);
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern18(n) {
  let outputString = "";
  for (let row = 1; row <= n * 2; row++) {
    const spaceStartIndex = row <= n ? n - (row - 2) : row - n + 1;
    const spaceEndIndex = row <= n ? n + (row - 1) : 3 * n - row;
    for (let column = 1; column <= n * 2; column++) {
      if (spaceStartIndex <= column && column <= spaceEndIndex) {
        outputString += " ";
      } else {
        outputString += "*";
      }
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern19(n) {
  let outputString = "";
  for (let row = 1; row <= n * 2 - 1; row++) {
    const spaceStartIndex = row <= n ? row + 1 : 2 * n - row + 1;
    const spaceEndIndex = row <= n ? 2 * n - row : row;
    for (let column = 1; column <= n * 2; column++) {
      if (spaceStartIndex <= column && column <= spaceEndIndex) {
        outputString += " ";
      } else {
        outputString += "*";
      }
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern20(n) {
  let outputString = "";
  for (let row = 1; row <= n; row++) {
    for (let column = 1; column <= n - 1; column++) {
      if (row === 1 || row === n || column === 1 || column === n - 1) {
        outputString += "*";
      } else {
        outputString += " ";
      }
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern21(n) {
  const maxNumber = (n * (n + 1)) / 2;
  const maxDigits = maxNumber.toString().length;

  let counter = 1;

  let outputString = "";

  for (let row = 1; row <= n; row++) {
    for (let column = 1; column <= row; column++) {
      outputString += counter.toString().padEnd(maxDigits + 1, " ");
      counter++;
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern22(n) {
  let outputString = "";
  for (let row = 1; row <= n; row++) {
    for (let column = 1; column <= row; column++) {
      if ((row + column) % 2 === 0) {
        outputString += "1 ";
      } else {
        outputString += "0 ";
      }
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern24(n) {
  let outputString = "";
  for (let row = 1; row <= 2 * n; row++) {
    for (let column = 1; column <= 2 * n; column++) {
      if (
        column === 1 ||
        column === 2 * n ||
        row === column ||
        2 * n - row + 1 === column
      )
        outputString += "*";
      else outputString += " ";
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern25(n) {
  let outputString = "";
  for (let row = 1; row <= n; row++) {
    const columnStart = n - row + 1;
    const columnEnd = columnStart + n - 1;
    for (let column = 1; column <= columnEnd; column++) {
      if (
        (column === columnStart ||
          column === columnEnd ||
          row === 1 ||
          row === n) &&
        columnStart <= column &&
        column <= columnEnd
      )
        outputString += "*";
      else outputString += " ";
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern26(n) {
  let outputString = "";
  const maxCharLength = (n + 1).toString().length;
  for (let row = 1; row <= n + 1; row++) {
    for (let column = 1; column <= n + 2 - row; column++) {
      outputString += row.toString().padEnd(maxCharLength + 1, " ");
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern27(n) {
  let outputString = "";
  const maxNumber = n * (n - 1);
  const noOfRows = n - 1;
  const noOfColumns = (n - 1) * 2;
  let leftColumnStart = 1;
  let rightColumnStart = maxNumber - (n - 2);
  for (let row = 1; row <= noOfRows; row++) {
    let spaceBefore = row - 1;
    let maxInCurrentColumnLeft = 1;
    let maxInCurrentColumnRight = maxNumber - (n - 2);
    let noToPrintLeft = leftColumnStart;
    let noToPrintRight = rightColumnStart;
    for (let column = 1; column <= noOfColumns; column++) {
      if (column <= noOfColumns / 2) {
        let maxNoOfDigitInColumn = maxInCurrentColumnLeft.toString().length + 1;
        if (column <= spaceBefore) {
          outputString += "".padEnd(maxNoOfDigitInColumn, " ");
        } else {
          outputString += noToPrintLeft
            .toString()
            .padEnd(maxNoOfDigitInColumn, " ");
          noToPrintLeft++;
        }
        maxInCurrentColumnLeft =
          maxInCurrentColumnLeft + (n - 1) - (column - 1);
      } else {
        let maxNoOfDigitInColumn =
          maxInCurrentColumnRight.toString().length + 1;
        if (column <= noOfColumns - (row - 1)) {
          outputString += noToPrintRight
            .toString()
            .padEnd(maxNoOfDigitInColumn, " ");
          noToPrintRight++;
        }
        maxInCurrentColumnRight =
          maxInCurrentColumnRight + (column - noOfColumns / 2);
      }
    }
    outputString += "\n";
    leftColumnStart = leftColumnStart + (n - 1) - (row - 1);
    rightColumnStart = rightColumnStart - (n - 2 - (row - 1));
  }
  console.log(outputString);
}

function pattern28(n) {
  let outputString = "";
  const noOfRows = n * 2 - 1;
  for (let row = 1; row <= noOfRows; row++) {
    const noOfSpace = row <= n ? n - row : row - n;
    const noOfStarts = row <= n ? row : 2 * n - row;

    for (let space = 1; space <= noOfSpace; space++) {
      outputString += " ";
    }

    for (let star = 1; star <= noOfStarts; star++) {
      outputString += "* ";
    }
    outputString += "\n";
  }

  console.log(outputString);
}

function pattern29(n) {
  let outputString = "";
  const noOfRows = n * 2 - 1;
  for (let row = 1; row <= noOfRows; row++) {
    const noOfStartsBefore = row <= n ? row : 2 * n - row;
    const noOfStartsAfter = noOfStartsBefore;
    const noOfSpace = row <= n ? 2 * n - 2 * row : (row - n) * 2;

    for (let starBefore = 1; starBefore <= noOfStartsBefore; starBefore++) {
      outputString += "*";
    }
    for (let space = 1; space <= noOfSpace; space++) {
      outputString += " ";
    }
    for (let startAfter = 1; startAfter <= noOfStartsAfter; startAfter++) {
      outputString += "*";
    }
    outputString += "\n";
  }

  console.log(outputString);
}

function pattern30(n) {
  let outputString = "";
  const noOfRows = n;
  for (let row = 1; row <= noOfRows; row++) {
    const noOfSpace = n - row;
    const noOfNumbersBefore = row;
    const noOfNumbersAfter = row - 1;

    for (let space = 1; space <= noOfSpace; space++) {
      outputString += "  ";
    }

    let leftNumberStart = row;
    for (
      let numberBefore = 1;
      numberBefore <= noOfNumbersBefore;
      numberBefore++
    ) {
      outputString += leftNumberStart + " ";
      leftNumberStart--;
    }

    let rightNumberStart = 2;
    for (let numberAfter = 1; numberAfter <= noOfNumbersAfter; numberAfter++) {
      outputString += rightNumberStart + " ";
      rightNumberStart++;
    }
    outputString += "\n";
  }

  console.log(outputString);
}

function pattern31(n) {
  let outputString = "";
  const noOfRows = (n - 1) * 2 - 1;
  const noOfColumns = noOfRows;
  const maxCharLengthInColumn = (n - 1).toString().length + 1;
  for (let row = 1; row <= noOfRows; row++) {
    for (let column = 1; column <= noOfColumns; column++) {
      const minDistanceFromBorder = Math.min(
        row,
        column,
        noOfRows - (row - 1),
        noOfColumns - (column - 1)
      );
      const currentNumber = n - 1 - (minDistanceFromBorder - 1);

      outputString += currentNumber
        .toString()
        .padEnd(maxCharLengthInColumn, " ");
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern32(n) {
  let outputString = "";

  for (let row = 1; row <= n; row++) {
    let charCodeStart = 65 + n - row;
    for (let column = 1; column <= row; column++) {
      const character = String.fromCharCode(charCodeStart);
      outputString += character + " ";
      charCodeStart++;
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern33(n) {
  let outputString = "";
  let charCodeStart = 65;
  let isSmall = true;
  for (let row = 1; row <= n; row++) {
    for (let column = 1; column <= row; column++) {
      const character = String.fromCharCode(charCodeStart);
      outputString += (isSmall ? character.toLowerCase() : character) + " ";
      charCodeStart++;
      isSmall = !isSmall;
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern34(n) {
  let outputString = "";

  for (let row = 1; row <= n; row++) {
    let charCodeStart = 65 + n - row;

    for (let column = row; column <= n; column++) {
      const character = String.fromCharCode(charCodeStart);
      outputString += character + " ";
      charCodeStart--;
    }
    outputString += "\n";
  }
  console.log(outputString);
}

function pattern35(n) {
  let outputString = "";
  const noOfRows = n - 1;
  const noOfColumns = (n - 1) * 2;
  for (let row = 1; row <= noOfRows; row++) {
    const spaceStart = row + 1;
    const spaceEnd = noOfColumns - row;
    for (let column = 1; column <= noOfColumns; column++) {
      let currentNumber =
        column <= noOfRows ? column : noOfRows * 2 - column + 1;
      if (spaceStart <= column && column <= spaceEnd) {
        outputString += "".padEnd(currentNumber.toString().length, " ");
      } else {
        outputString += currentNumber;
      }
    }
    outputString += "\n";
  }
  console.log(outputString);
}

pattern1(5);
pattern2(5);
pattern3(5);
pattern4(5);
pattern5(5);
pattern6(5);
pattern7(5);
pattern8(5);
pattern9(5);
pattern10(5);
pattern11(5);
pattern12(5);
pattern13(5);
pattern14(5);
pattern15(5);
pattern16(5);
pattern17(5);
pattern18(5);
pattern19(5);
pattern20(5);
pattern21(5);
pattern22(5);
pattern24(5);
pattern25(5);
pattern26(5);
pattern27(5);
pattern28(5);
pattern29(5);
pattern30(5);
pattern31(5);
pattern32(5);
pattern33(5);
pattern34(5);
pattern35(5);
