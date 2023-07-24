.class public final Ld/a/a/a/d;
.super Le/b/a/a0/d;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/b/a/a0/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Le/b/a/d;Lcom/bumptech/glide/Registry;)V
    .locals 2

    const-class v0, Le/c/a/a2;

    const-string v1, "context"

    invoke-static {p1, v1}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "glide"

    invoke-static {p2, v1}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "registry"

    invoke-static {p3, p2}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    const-class p2, Landroid/graphics/drawable/Drawable;

    new-instance v1, Ld/a/a/a/c;

    invoke-direct {v1, p1}, Ld/a/a/a/c;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, v0, p2, v1}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/z/j/e;)Lcom/bumptech/glide/Registry;

    .line 2
    const-class p1, Landroid/graphics/Bitmap;

    new-instance p2, Ld/a/a/a/a;

    invoke-direct {p2}, Ld/a/a/a/a;-><init>()V

    invoke-virtual {p3, v0, p1, p2}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/z/j/e;)Lcom/bumptech/glide/Registry;

    .line 3
    const-class p1, Ljava/io/InputStream;

    new-instance p2, Ld/a/a/a/b;

    invoke-direct {p2}, Ld/a/a/a/b;-><init>()V

    invoke-virtual {p3, p1, v0, p2}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;

    return-void
.end method
