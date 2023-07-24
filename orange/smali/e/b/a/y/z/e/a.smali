.class public Le/b/a/y/z/e/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/t;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/t<",
        "TDataType;",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/t<",
            "TDataType;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Le/b/a/y/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "Le/b/a/y/t<",
            "TDataType;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Landroid/content/res/Resources;

    iput-object p1, p0, Le/b/a/y/z/e/a;->b:Landroid/content/res/Resources;

    .line 3
    invoke-static {p2}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, Le/b/a/y/t;

    iput-object p2, p0, Le/b/a/y/z/e/a;->a:Le/b/a/y/t;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDataType;II",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/x/y0<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/b/a/y/z/e/a;->a:Le/b/a/y/t;

    invoke-interface {v0, p1, p2, p3, p4}, Le/b/a/y/t;->a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/x/y0;

    move-result-object p1

    .line 3
    iget-object p2, p0, Le/b/a/y/z/e/a;->b:Landroid/content/res/Resources;

    invoke-static {p2, p1}, Le/b/a/y/z/e/j0;->a(Landroid/content/res/Resources;Le/b/a/y/x/y0;)Le/b/a/y/x/y0;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/Object;Le/b/a/y/r;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDataType;",
            "Le/b/a/y/r;",
            ")Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/z/e/a;->a:Le/b/a/y/t;

    invoke-interface {v0, p1, p2}, Le/b/a/y/t;->a(Ljava/lang/Object;Le/b/a/y/r;)Z

    move-result p1

    return p1
.end method
