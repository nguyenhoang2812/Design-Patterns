
⬛️Creation patterns 
+ Factory method: giúp việc tạo đối tượng mà không cần biết rõ về class nó được tạo, thêm được logic xử lý trong FactoryMethod mà thường phải thêm runtime 

+ SingleTon: Chỉ duy nhất 1 instance được lưu hành  

+ Builder: giúp việc giảm sự phức tạp hóa khi 1 class có quá nhiều thuộc tính dẫn đến constructor có quá nhiều tham số 



⬛️Structure patterns 
+ Decorator:Đối tượng sẽ được gán thêm nhiều chức năng hoặc nhiều thành phần (trà sữa original + trân châu + pudding,...) 

+ 

⬛️Behavior pattern 



+ Observer: Cập nhật thay đổi đến mọi đối tượng(quan hệ 1-n) khi đối tượng phụ thuộc thay đổi(ex:notification).

+ Strategy(chiến lược): tùy thuộc vào bài toán đưa ra sẽ chọn 1 giải thuật phù hợp(VD: bubble sort , Quick sort ...). 

+ Command: + Tách rời sender với receiver yêu cầu: người gửi không cần quan tâm yêu cầu ấy do ai thực hiện và bằng cách nào
           + Có thể lưu trữ các yêu cầu bằng stack/queue khi muốn undo lại yêu câu theo thứ tự ngược lại 