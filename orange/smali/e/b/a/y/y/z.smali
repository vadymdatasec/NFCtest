.class public final Le/b/a/y/y/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/w0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/y/w0<",
        "Ljava/lang/Integer;",
        "TDataT;>;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Le/b/a/y/y/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/y<",
            "TDataT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/b/a/y/y/y;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Le/b/a/y/y/y<",
            "TDataT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Le/b/a/y/y/z;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Le/b/a/y/y/z;->b:Le/b/a/y/y/y;

    return-void
.end method

.method public static a(Landroid/content/Context;)Le/b/a/y/y/x0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Le/b/a/y/y/x0<",
            "Ljava/lang/Integer;",
            "Landroid/content/res/AssetFileDescriptor;",
            ">;"
        }
    .end annotation

    .line 3
    new-instance v0, Le/b/a/y/y/u;

    invoke-direct {v0, p0}, Le/b/a/y/y/u;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Le/b/a/y/y/x0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Le/b/a/y/y/x0<",
            "Ljava/lang/Integer;",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/b/a/y/y/v;

    invoke-direct {v0, p0}, Le/b/a/y/y/v;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Le/b/a/y/y/x0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Le/b/a/y/y/x0<",
            "Ljava/lang/Integer;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/b/a/y/y/w;

    invoke-direct {v0, p0}, Le/b/a/y/y/w;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Integer;IILe/b/a/y/r;)Le/b/a/y/y/v0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "II",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/y/v0<",
            "TDataT;>;"
        }
    .end annotation

    .line 4
    sget-object p2, Le/b/a/y/z/g/h;->b:Le/b/a/y/q;

    invoke-virtual {p4, p2}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/res/Resources$Theme;

    .line 5
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p4, 0x15

    if-lt p3, p4, :cond_0

    if-eqz p2, :cond_0

    .line 6
    invoke-virtual {p2}, Landroid/content/res/Resources$Theme;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    goto :goto_0

    .line 7
    :cond_0
    iget-object p3, p0, Le/b/a/y/y/z;->a:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    .line 8
    :goto_0
    new-instance p4, Le/b/a/y/y/v0;

    new-instance v0, Le/b/a/d0/d;

    invoke-direct {v0, p1}, Le/b/a/d0/d;-><init>(Ljava/lang/Object;)V

    new-instance v1, Le/b/a/y/y/x;

    iget-object v2, p0, Le/b/a/y/y/z;->b:Le/b/a/y/y/y;

    .line 9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {v1, p2, p3, v2, p1}, Le/b/a/y/y/x;-><init>(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Le/b/a/y/y/y;I)V

    invoke-direct {p4, v0, v1}, Le/b/a/y/y/v0;-><init>(Le/b/a/y/n;Le/b/a/y/w/e;)V

    return-object p4
.end method

.method public bridge synthetic a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/y/v0;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/y/z;->a(Ljava/lang/Integer;IILe/b/a/y/r;)Le/b/a/y/y/v0;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/Integer;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Le/b/a/y/y/z;->a(Ljava/lang/Integer;)Z

    move-result p1

    return p1
.end method
