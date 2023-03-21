# Supervise 

$(x^(i),y^(i))$ = a list of _m_ *training example* ,i = {1,...,...,m}

> - training set
> - learning algo 

~~~latex
h(x) = \sum^n_{i=0}\theta_i x_i = \theta^T x_i 
~~~

# costfunction

~~~latex
J(\vtheta)= \frac{1}{2m} \sum^m_{i=0}h_{\theta}(x^{(i)}-y^{(i)})^2
~~~

- under/over fitting

# Locally weighted linear regression

~~~latex
w^{(i)}= \exp(-\frac{(x^{(i)}-x)^2}{2\tau^2})
~~~

# logistic regression

- sigmoid

