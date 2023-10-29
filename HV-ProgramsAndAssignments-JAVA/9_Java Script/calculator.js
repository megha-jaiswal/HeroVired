let inputValue=items.value;


document.getElementById('btn-equals').addEventListener('click', function() {

    const inputValue = display.value;

    try {

        const result = eval(inputValue); // Use eval for simplicity

        display.value = result;

    } catch (error) {

        display.value = 'Error';

    }

});

document.getElementById('btn-clear').addEventListener('click', function() {

    display.value = '';

});