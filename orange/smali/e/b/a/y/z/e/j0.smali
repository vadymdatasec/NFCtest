.class public final Le/b/a/y/z/e/j0;
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
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;",
        "Le/b/a/y/x/t0;"
    }
.end annotation


# instance fields
.field public final b:Landroid/content/res/Resources;

.field public final c:Le/b/a/y/x/y0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/x/y0<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Le/b/a/y/x/y0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "Le/b/a/y/x/y0<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Landroid/content/res/Resources;

    iput-object p1, p0, Le/b/a/y/z/e/j0;->b:Landroid/content/res/Resources;

    .line 3
    invoke-static {p2}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, Le/b/a/y/x/y0;

    iput-object p2, p0, Le/b/a/y/z/e/j0;->c:Le/b/a/y/x/y0;

    return-void
.end method

.method public static a(Landroid/content/res/Resources;Le/b/a/y/x/y0;)Le/b/a/y/x/y0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "Le/b/a/y/x/y0<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Le/b/a/y/x/y0<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    new-instance v0, Le/b/a/y/z/e/j0;

    invoke-direct {v0, p0, p1}, Le/b/a/y/z/e/j0;-><init>(Landroid/content/res/Resources;Le/b/a/y/x/y0;)V

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 2
    iget-object v0, p0, Le/b/a/y/z/e/j0;->c:Le/b/a/y/x/y0;

    instance-of v1, v0, Le/b/a/y/x/t0;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Le/b/a/y/x/t0;

    invoke-interface {v0}, Le/b/a/y/x/t0;->a()V

    :cond_0
    return-void
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/z/e/j0;->c:Le/b/a/y/x/y0;

    invoke-interface {v0}, Le/b/a/y/x/y0;->b()I

    move-result v0

    return v0
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Landroid/graphics/drawable/BitmapDrawable;

    return-object v0
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/z/e/j0;->c:Le/b/a/y/x/y0;

    invoke-interface {v0}, Le/b/a/y/x/y0;->d()V

    return-void
.end method

.method public get()Landroid/graphics/drawable/BitmapDrawable;
    .locals 3

    .line 2
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v1, p0, Le/b/a/y/z/e/j0;->b:Landroid/content/res/Resources;

    iget-object v2, p0, Le/b/a/y/z/e/j0;->c:Le/b/a/y/x/y0;

    invoke-interface {v2}, Le/b/a/y/x/y0;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/b/a/y/z/e/j0;->get()Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v0

    return-object v0
.end method
