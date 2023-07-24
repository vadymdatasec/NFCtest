.class public abstract Le/f/c/l/e/o/q2;
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

.method public static f()Le/f/c/l/e/o/p2;
    .locals 1

    .line 1
    new-instance v0, Le/f/c/l/e/o/b1;

    invoke-direct {v0}, Le/f/c/l/e/o/b1;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract a()J
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()J
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public e()[B
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/o/q2;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Le/f/c/l/e/o/o3;->k()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
