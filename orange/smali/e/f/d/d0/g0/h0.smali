.class public final Le/f/d/d0/g0/h0;
.super Le/f/d/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/d/a0<",
        "Ljava/net/InetAddress;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/d/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Le/f/d/f0/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Le/f/d/d0/g0/h0;->a(Le/f/d/f0/c;)Ljava/net/InetAddress;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/d/f0/c;)Ljava/net/InetAddress;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    invoke-virtual {p1}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    move-result-object v0

    sget-object v1, Le/f/d/f0/e;->j:Le/f/d/f0/e;

    if-ne v0, v1, :cond_0

    .line 4
    invoke-virtual {p1}, Le/f/d/f0/c;->B()V

    const/4 p1, 0x0

    return-object p1

    .line 5
    :cond_0
    invoke-virtual {p1}, Le/f/d/f0/c;->C()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Le/f/d/f0/g;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    check-cast p2, Ljava/net/InetAddress;

    invoke-virtual {p0, p1, p2}, Le/f/d/d0/g0/h0;->a(Le/f/d/f0/g;Ljava/net/InetAddress;)V

    return-void
.end method

.method public a(Le/f/d/f0/g;Ljava/net/InetAddress;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Le/f/d/f0/g;->d(Ljava/lang/String;)Le/f/d/f0/g;

    return-void
.end method
