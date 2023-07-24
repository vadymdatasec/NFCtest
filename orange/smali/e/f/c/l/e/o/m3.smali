.class public abstract Le/f/c/l/e/o/m3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static n()Le/f/c/l/e/o/l2;
    .locals 2

    .line 1
    new-instance v0, Le/f/c/l/e/o/i0;

    invoke-direct {v0}, Le/f/c/l/e/o/i0;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Le/f/c/l/e/o/i0;->a(Z)Le/f/c/l/e/o/l2;

    return-object v0
.end method


# virtual methods
.method public abstract a()Le/f/c/l/e/o/k2;
.end method

.method public a(JZLjava/lang/String;)Le/f/c/l/e/o/m3;
    .locals 1

    .line 2
    invoke-virtual {p0}, Le/f/c/l/e/o/m3;->m()Le/f/c/l/e/o/l2;

    move-result-object v0

    .line 3
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/c/l/e/o/l2;->a(Ljava/lang/Long;)Le/f/c/l/e/o/l2;

    .line 4
    invoke-virtual {v0, p3}, Le/f/c/l/e/o/l2;->a(Z)Le/f/c/l/e/o/l2;

    if-eqz p4, :cond_0

    .line 5
    invoke-static {}, Le/f/c/l/e/o/l3;->b()Le/f/c/l/e/o/k3;

    move-result-object p1

    invoke-virtual {p1, p4}, Le/f/c/l/e/o/k3;->a(Ljava/lang/String;)Le/f/c/l/e/o/k3;

    invoke-virtual {p1}, Le/f/c/l/e/o/k3;->a()Le/f/c/l/e/o/l3;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/c/l/e/o/l2;->a(Le/f/c/l/e/o/l3;)Le/f/c/l/e/o/l2;

    invoke-virtual {v0}, Le/f/c/l/e/o/l2;->a()Le/f/c/l/e/o/m3;

    .line 6
    :cond_0
    invoke-virtual {v0}, Le/f/c/l/e/o/l2;->a()Le/f/c/l/e/o/m3;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/m3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/h3;",
            ">;)",
            "Le/f/c/l/e/o/m3;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/o/m3;->m()Le/f/c/l/e/o/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/f/c/l/e/o/l2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/l2;

    invoke-virtual {v0}, Le/f/c/l/e/o/l2;->a()Le/f/c/l/e/o/m3;

    move-result-object p1

    return-object p1
.end method

.method public abstract b()Le/f/c/l/e/o/n2;
.end method

.method public abstract c()Ljava/lang/Long;
.end method

.method public abstract d()Le/f/c/l/e/o/p3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/h3;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()I
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public h()[B
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/o/m3;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Le/f/c/l/e/o/o3;->k()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    return-object v0
.end method

.method public abstract i()Le/f/c/l/e/o/j3;
.end method

.method public abstract j()J
.end method

.method public abstract k()Le/f/c/l/e/o/l3;
.end method

.method public abstract l()Z
.end method

.method public abstract m()Le/f/c/l/e/o/l2;
.end method
