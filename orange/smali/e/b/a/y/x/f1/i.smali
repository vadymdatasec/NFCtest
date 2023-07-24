.class public final Le/b/a/y/x/f1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/x/f1/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/x/f1/a<",
        "[B>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, [B

    invoke-virtual {p0, p1}, Le/b/a/y/x/f1/i;->a([B)I

    move-result p1

    return p1
.end method

.method public a([B)I
    .locals 0

    .line 2
    array-length p1, p1

    return p1
.end method

.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "ByteArrayPool"

    return-object v0
.end method

.method public b()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newArray(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/b/a/y/x/f1/i;->newArray(I)[B

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[B
    .locals 0

    .line 2
    new-array p1, p1, [B

    return-object p1
.end method
