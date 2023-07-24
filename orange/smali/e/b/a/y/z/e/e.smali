.class public Le/b/a/y/z/e/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/x/y0;
.implements Le/b/a/y/x/t0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/x/y0<",
        "Landroid/graphics/Bitmap;",
        ">;",
        "Le/b/a/y/x/t0;"
    }
.end annotation


# instance fields
.field public final b:Landroid/graphics/Bitmap;

.field public final c:Le/b/a/y/x/f1/g;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Le/b/a/y/x/f1/g;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Bitmap must not be null"

    .line 2
    invoke-static {p1, v0}, Le/b/a/e0/r;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Landroid/graphics/Bitmap;

    iput-object p1, p0, Le/b/a/y/z/e/e;->b:Landroid/graphics/Bitmap;

    const-string p1, "BitmapPool must not be null"

    .line 3
    invoke-static {p2, p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p2, Le/b/a/y/x/f1/g;

    iput-object p2, p0, Le/b/a/y/z/e/e;->c:Le/b/a/y/x/f1/g;

    return-void
.end method

.method public static a(Landroid/graphics/Bitmap;Le/b/a/y/x/f1/g;)Le/b/a/y/z/e/e;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    new-instance v0, Le/b/a/y/z/e/e;

    invoke-direct {v0, p0, p1}, Le/b/a/y/z/e/e;-><init>(Landroid/graphics/Bitmap;Le/b/a/y/x/f1/g;)V

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 2
    iget-object v0, p0, Le/b/a/y/z/e/e;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    return-void
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/z/e/e;->b:Landroid/graphics/Bitmap;

    invoke-static {v0}, Le/b/a/e0/t;->a(Landroid/graphics/Bitmap;)I

    move-result v0

    return v0
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/y/z/e/e;->c:Le/b/a/y/x/f1/g;

    iget-object v1, p0, Le/b/a/y/z/e/e;->b:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1}, Le/b/a/y/x/f1/g;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public get()Landroid/graphics/Bitmap;
    .locals 1

    .line 2
    iget-object v0, p0, Le/b/a/y/z/e/e;->b:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/b/a/y/z/e/e;->get()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
