.class public Le/b/a/y/z/e/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/t;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/t<",
        "Landroid/net/Uri;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/z/g/h;

.field public final b:Le/b/a/y/x/f1/g;


# direct methods
.method public constructor <init>(Le/b/a/y/z/g/h;Le/b/a/y/x/f1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/z/e/n0;->a:Le/b/a/y/z/g/h;

    .line 3
    iput-object p2, p0, Le/b/a/y/z/e/n0;->b:Le/b/a/y/x/f1/g;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;IILe/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "II",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/x/y0<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Le/b/a/y/z/e/n0;->a:Le/b/a/y/z/g/h;

    invoke-virtual {v0, p1, p2, p3, p4}, Le/b/a/y/z/g/h;->a(Landroid/net/Uri;IILe/b/a/y/r;)Le/b/a/y/x/y0;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Le/b/a/y/x/y0;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 6
    iget-object p4, p0, Le/b/a/y/z/e/n0;->b:Le/b/a/y/x/f1/g;

    invoke-static {p4, p1, p2, p3}, Le/b/a/y/z/e/z;->a(Le/b/a/y/x/f1/g;Landroid/graphics/drawable/Drawable;II)Le/b/a/y/x/y0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/z/e/n0;->a(Landroid/net/Uri;IILe/b/a/y/r;)Le/b/a/y/x/y0;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/net/Uri;Le/b/a/y/r;)Z
    .locals 0

    .line 3
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string p2, "android.resource"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;Le/b/a/y/r;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2}, Le/b/a/y/z/e/n0;->a(Landroid/net/Uri;Le/b/a/y/r;)Z

    move-result p1

    return p1
.end method
