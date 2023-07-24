.class public Lk/m0;
.super Lk/e1/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk/e1/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lk/y0;)I
    .locals 0

    .line 8
    iget p1, p1, Lk/y0;->c:I

    return p1
.end method

.method public a(Lk/g;Ljava/io/IOException;)Ljava/io/IOException;
    .locals 0

    .line 10
    check-cast p1, Lk/s0;

    invoke-virtual {p1, p2}, Lk/s0;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public a(Lk/o;Lk/a;Lk/e1/h/h;)Ljava/net/Socket;
    .locals 0

    .line 6
    invoke-virtual {p1, p2, p3}, Lk/o;->a(Lk/a;Lk/e1/h/h;)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method public a(Lk/o;Lk/a;Lk/e1/h/h;Lk/c1;)Lk/e1/h/c;
    .locals 0

    .line 4
    invoke-virtual {p1, p2, p3, p4}, Lk/o;->a(Lk/a;Lk/e1/h/h;Lk/c1;)Lk/e1/h/c;

    move-result-object p1

    return-object p1
.end method

.method public a(Lk/o;)Lk/e1/h/d;
    .locals 0

    .line 7
    iget-object p1, p1, Lk/o;->e:Lk/e1/h/d;

    return-object p1
.end method

.method public a(Lk/c0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Lk/c0;->a(Ljava/lang/String;)Lk/c0;

    return-void
.end method

.method public a(Lk/c0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-virtual {p1, p2, p3}, Lk/c0;->b(Ljava/lang/String;Ljava/lang/String;)Lk/c0;

    return-void
.end method

.method public a(Lk/q;Ljavax/net/ssl/SSLSocket;Z)V
    .locals 0

    .line 9
    invoke-virtual {p1, p2, p3}, Lk/q;->a(Ljavax/net/ssl/SSLSocket;Z)V

    return-void
.end method

.method public a(Lk/a;Lk/a;)Z
    .locals 0

    .line 5
    invoke-virtual {p1, p2}, Lk/a;->a(Lk/a;)Z

    move-result p1

    return p1
.end method

.method public a(Lk/o;Lk/e1/h/c;)Z
    .locals 0

    .line 3
    invoke-virtual {p1, p2}, Lk/o;->a(Lk/e1/h/c;)Z

    move-result p1

    return p1
.end method

.method public b(Lk/o;Lk/e1/h/c;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Lk/o;->b(Lk/e1/h/c;)V

    return-void
.end method
