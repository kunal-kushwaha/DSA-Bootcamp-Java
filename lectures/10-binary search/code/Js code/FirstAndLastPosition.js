const searchRange = (nums, target) =>{
    let position = [-1, -1]
    // run loop from starting upto target element and take the index
    for(let i = 0; i < nums.length ; i++){
        if(nums[i] === target){
            position[0] = i
            break
        }
    }
    // run the loop from end to target element and take the index
    for (let i = nums.length - 1; i >= 0; i--){
        if (nums[i] === target){
            position[1] = i
            break
        }
    }
    return position
};
console.log(searchRange([5,7,7,8,8,10], 8))