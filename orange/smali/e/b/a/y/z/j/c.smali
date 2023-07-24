.class public final Le/b/a/y/z/j/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/z/j/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/z/j/e<",
        "Landroid/graphics/drawable/Drawable;",
        "[B>;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/x/f1/g;

.field public final b:Le/b/a/y/z/j/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/z/j/e<",
            "Landroid/graphics/Bitmap;",
            "[B>;"
        }
    .end annotation
.end field

.field public final c:Le/b/a/y/z/j/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/z/j/e<",
            "Le/b/a/y/z/i/f;",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/b/a/y/x/f1/g;Le/b/a/y/z/j/e;Le/b/a/y/z/j/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/f1/g;",
            "Le/b/a/y/z/j/e<",
            "Landroid/graphics/Bitmap;",
            "[B>;",
            "Le/b/a/y/z/j/e<",
            "Le/b/a/y/z/i/f;",
            "[B>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/z/j/c;->a:Le/b/a/y/x/f1/g;

    .line 3
    iput-object p2, p0, Le/b/a/y/z/j/c;->b:Le/b/a/y/z/j/e;

    .line 4
    iput-object p3, p0, Le/b/a/y/z/j/c;->c:Le/b/a/y/z/j/e;

    return-void
.end method

.method public static a(Le/b/a/y/x/y0;)Le/b/a/y/x/y0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "Landroid/graphics/drawable/Drawable;",
            ">;)",
            "Le/b/a/y/x/y0<",
            "Le/b/a/y/z/i/f;",
            ">;"
        }
    .end annotation

    return-object p0
.end method


# virtual methods
.method public a(Le/b/a/y/x/y0;Le/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "Landroid/graphics/drawable/Drawable;",
            ">;",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/x/y0<",
            "[B>;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Le/b/a/y/x/y0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 2
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_0

    .line 3
    iget-object p1, p0, Le/b/a/y/z/j/c;->b:Le/b/a/y/z/j/e;

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 4
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Le/b/a/y/z/j/c;->a:Le/b/a/y/x/f1/g;

    invoke-static {v0, v1}, Le/b/a/y/z/e/e;->a(Landroid/graphics/Bitmap;Le/b/a/y/x/f1/g;)Le/b/a/y/z/e/e;

    move-result-object v0

    .line 5
    invoke-interface {p1, v0, p2}, Le/b/a/y/z/j/e;->a(Le/b/a/y/x/y0;Le/b/a/y/r;)Le/b/a/y/x/y0;

    move-result-object p1

    return-object p1

    .line 6
    :cond_0
    instance-of v0, v0, Le/b/a/y/z/i/f;

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Le/b/a/y/z/j/c;->c:Le/b/a/y/z/j/e;

    invoke-static {p1}, Le/b/a/y/z/j/c;->a(Le/b/a/y/x/y0;)Le/b/a/y/x/y0;

    invoke-interface {v0, p1, p2}, Le/b/a/y/z/j/e;->a(Le/b/a/y/x/y0;Le/b/a/y/r;)Le/b/a/y/x/y0;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
