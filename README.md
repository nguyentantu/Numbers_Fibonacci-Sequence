# Numbers_Fibonacci-Sequence

Thuật toán in dãy Fibonacci n phần tử, với n được nhập từ bàn phím:
- Ở đây ta xét với điều kiện dãy Fibonacci có từ 2 phần tử trở lên.
- Đầu tiên ta nhập vào số nguyên n.
- Ta khởi tạo 3 biến n1, n2, fibo và gán giá trị tương ứng cho 2 biến n1 và n2 là 0 và 1.Ta tiến hành in giá trị của 2 biến này ra, đó cũng chính là 2 phần tử đầu tiên trong dãy Fibonacci.
- Tiếp theo ta thực hiện vòng lặp for với giá trị ban đầu là i = 2, cho đến khi i < n. Cứ mỗi giá trị của i tăng lên sẽ có 1 giá trị fibo mới được tính bằng tổng 2 phần tử trước nó. Sau khi tính giá trị của fibo thì ta sẽ in nó ra màn hình.Như vậy giá trị của n cũng chính là số phần tử của dãy Fibonacci.
Sau mỗi lần i thì 2 biến n1 và n2 sẽ được gán lại giá trị mới để tính cho lần lặp tiếp theo, n1 = n2 và n2 = fibo. 
Công việc lặp lại cho đến khi khi lớn hơn hoặc bằng giá trị của n thì kết thúc chương trình.

