.class public Le/b/a/y/z/i/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/v<",
        "Le/b/a/y/z/i/f;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Le/b/a/y/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/v<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/b/a/y/v;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/v<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Le/b/a/y/v;

    iput-object p1, p0, Le/b/a/y/z/i/i;->b:Le/b/a/y/v;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Le/b/a/y/x/y0;II)Le/b/a/y/x/y0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Le/b/a/y/x/y0<",
            "Le/b/a/y/z/i/f;",
            ">;II)",
            "Le/b/a/y/x/y0<",
            "Le/b/a/y/z/i/f;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Le/b/a/y/x/y0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/y/z/i/f;

    .line 2
    invoke-static {p1}, Le/b/a/d;->a(Landroid/content/Context;)Le/b/a/d;

    move-result-object v1

    invoke-virtual {v1}, Le/b/a/d;->c()Le/b/a/y/x/f1/g;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Le/b/a/y/z/i/f;->e()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 4
    new-instance v3, Le/b/a/y/z/e/e;

    invoke-direct {v3, v2, v1}, Le/b/a/y/z/e/e;-><init>(Landroid/graphics/Bitmap;Le/b/a/y/x/f1/g;)V

    .line 5
    iget-object v1, p0, Le/b/a/y/z/i/i;->b:Le/b/a/y/v;

    invoke-interface {v1, p1, v3, p3, p4}, Le/b/a/y/v;->a(Landroid/content/Context;Le/b/a/y/x/y0;II)Le/b/a/y/x/y0;

    move-result-object p1

    .line 6
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    .line 7
    invoke-interface {v3}, Le/b/a/y/x/y0;->d()V

    .line 8
    :cond_0
    invoke-interface {p1}, Le/b/a/y/x/y0;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    .line 9
    iget-object p3, p0, Le/b/a/y/z/i/i;->b:Le/b/a/y/v;

    invoke-virtual {v0, p3, p1}, Le/b/a/y/z/i/f;->a(Le/b/a/y/v;Landroid/graphics/Bitmap;)V

    return-object p2
.end method

.method public a(Ljava/security/MessageDigest;)V
    .locals 1

    .line 10
    iget-object v0, p0, Le/b/a/y/z/i/i;->b:Le/b/a/y/v;

    invoke-interface {v0, p1}, Le/b/a/y/n;->a(Ljava/security/MessageDigest;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Le/b/a/y/z/i/i;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Le/b/a/y/z/i/i;

    .line 3
    iget-object v0, p0, Le/b/a/y/z/i/i;->b:Le/b/a/y/v;

    iget-object p1, p1, Le/b/a/y/z/i/i;->b:Le/b/a/y/v;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/z/i/i;->b:Le/b/a/y/v;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
