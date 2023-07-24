.class public abstract Le/f/c/l/e/o/l2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(I)Le/f/c/l/e/o/l2;
.end method

.method public abstract a(J)Le/f/c/l/e/o/l2;
.end method

.method public abstract a(Le/f/c/l/e/o/j3;)Le/f/c/l/e/o/l2;
.end method

.method public abstract a(Le/f/c/l/e/o/k2;)Le/f/c/l/e/o/l2;
.end method

.method public abstract a(Le/f/c/l/e/o/l3;)Le/f/c/l/e/o/l2;
.end method

.method public abstract a(Le/f/c/l/e/o/n2;)Le/f/c/l/e/o/l2;
.end method

.method public abstract a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/l2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/h3;",
            ">;)",
            "Le/f/c/l/e/o/l2;"
        }
    .end annotation
.end method

.method public abstract a(Ljava/lang/Long;)Le/f/c/l/e/o/l2;
.end method

.method public abstract a(Ljava/lang/String;)Le/f/c/l/e/o/l2;
.end method

.method public abstract a(Z)Le/f/c/l/e/o/l2;
.end method

.method public a([B)Le/f/c/l/e/o/l2;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/String;

    invoke-static {}, Le/f/c/l/e/o/o3;->k()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {p0, v0}, Le/f/c/l/e/o/l2;->b(Ljava/lang/String;)Le/f/c/l/e/o/l2;

    return-object p0
.end method

.method public abstract a()Le/f/c/l/e/o/m3;
.end method

.method public abstract b(Ljava/lang/String;)Le/f/c/l/e/o/l2;
.end method
