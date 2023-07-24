.class public final Le/b/a/y/z/i/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/x/a;


# instance fields
.field public final a:Le/b/a/y/x/f1/g;

.field public final b:Le/b/a/y/x/f1/b;


# direct methods
.method public constructor <init>(Le/b/a/y/x/f1/g;Le/b/a/y/x/f1/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/z/i/d;->a:Le/b/a/y/x/f1/g;

    .line 3
    iput-object p2, p0, Le/b/a/y/z/i/d;->b:Le/b/a/y/x/f1/b;

    return-void
.end method


# virtual methods
.method public a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/z/i/d;->a:Le/b/a/y/x/f1/g;

    invoke-interface {v0, p1, p2, p3}, Le/b/a/y/x/f1/g;->b(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 2
    iget-object v0, p0, Le/b/a/y/z/i/d;->a:Le/b/a/y/x/f1/g;

    invoke-interface {v0, p1}, Le/b/a/y/x/f1/g;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public a([B)V
    .locals 1

    .line 3
    iget-object v0, p0, Le/b/a/y/z/i/d;->b:Le/b/a/y/x/f1/b;

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-interface {v0, p1}, Le/b/a/y/x/f1/b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public a([I)V
    .locals 1

    .line 8
    iget-object v0, p0, Le/b/a/y/z/i/d;->b:Le/b/a/y/x/f1/b;

    if-nez v0, :cond_0

    return-void

    .line 9
    :cond_0
    invoke-interface {v0, p1}, Le/b/a/y/x/f1/b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public a(I)[I
    .locals 2

    .line 5
    iget-object v0, p0, Le/b/a/y/z/i/d;->b:Le/b/a/y/x/f1/b;

    if-nez v0, :cond_0

    .line 6
    new-array p1, p1, [I

    return-object p1

    .line 7
    :cond_0
    const-class v1, [I

    invoke-interface {v0, p1, v1}, Le/b/a/y/x/f1/b;->b(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    return-object p1
.end method

.method public b(I)[B
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/y/z/i/d;->b:Le/b/a/y/x/f1/b;

    if-nez v0, :cond_0

    .line 2
    new-array p1, p1, [B

    return-object p1

    .line 3
    :cond_0
    const-class v1, [B

    invoke-interface {v0, p1, v1}, Le/b/a/y/x/f1/b;->b(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    return-object p1
.end method
