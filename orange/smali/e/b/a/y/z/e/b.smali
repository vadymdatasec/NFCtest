.class public Le/b/a/y/z/e/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/u;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/u<",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/x/f1/g;

.field public final b:Le/b/a/y/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/u<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/b/a/y/x/f1/g;Le/b/a/y/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/f1/g;",
            "Le/b/a/y/u<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/z/e/b;->a:Le/b/a/y/x/f1/g;

    .line 3
    iput-object p2, p0, Le/b/a/y/z/e/b;->b:Le/b/a/y/u;

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/r;)Le/b/a/y/c;
    .locals 1

    .line 3
    iget-object v0, p0, Le/b/a/y/z/e/b;->b:Le/b/a/y/u;

    invoke-interface {v0, p1}, Le/b/a/y/u;->a(Le/b/a/y/r;)Le/b/a/y/c;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/b/a/y/x/y0;Ljava/io/File;Le/b/a/y/r;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;",
            "Ljava/io/File;",
            "Le/b/a/y/r;",
            ")Z"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/b/a/y/z/e/b;->b:Le/b/a/y/u;

    new-instance v1, Le/b/a/y/z/e/e;

    invoke-interface {p1}, Le/b/a/y/x/y0;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object v2, p0, Le/b/a/y/z/e/b;->a:Le/b/a/y/x/f1/g;

    invoke-direct {v1, p1, v2}, Le/b/a/y/z/e/e;-><init>(Landroid/graphics/Bitmap;Le/b/a/y/x/f1/g;)V

    invoke-interface {v0, v1, p2, p3}, Le/b/a/y/d;->a(Ljava/lang/Object;Ljava/io/File;Le/b/a/y/r;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/io/File;Le/b/a/y/r;)Z
    .locals 0

    .line 1
    check-cast p1, Le/b/a/y/x/y0;

    invoke-virtual {p0, p1, p2, p3}, Le/b/a/y/z/e/b;->a(Le/b/a/y/x/y0;Ljava/io/File;Le/b/a/y/r;)Z

    move-result p1

    return p1
.end method
