.class public final Le/b/a/y/z/i/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/t;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/t<",
        "Le/b/a/x/b;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/x/f1/g;


# direct methods
.method public constructor <init>(Le/b/a/y/x/f1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/z/i/o;->a:Le/b/a/y/x/f1/g;

    return-void
.end method


# virtual methods
.method public a(Le/b/a/x/b;IILe/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/x/b;",
            "II",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/x/y0<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 3
    invoke-interface {p1}, Le/b/a/x/b;->c()Landroid/graphics/Bitmap;

    move-result-object p1

    .line 4
    iget-object p2, p0, Le/b/a/y/z/i/o;->a:Le/b/a/y/x/f1/g;

    invoke-static {p1, p2}, Le/b/a/y/z/e/e;->a(Landroid/graphics/Bitmap;Le/b/a/y/x/f1/g;)Le/b/a/y/z/e/e;

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
    check-cast p1, Le/b/a/x/b;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/z/i/o;->a(Le/b/a/x/b;IILe/b/a/y/r;)Le/b/a/y/x/y0;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/b/a/x/b;Le/b/a/y/r;)Z
    .locals 0

    const/4 p1, 0x1

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
    check-cast p1, Le/b/a/x/b;

    invoke-virtual {p0, p1, p2}, Le/b/a/y/z/i/o;->a(Le/b/a/x/b;Le/b/a/y/r;)Z

    move-result p1

    return p1
.end method
