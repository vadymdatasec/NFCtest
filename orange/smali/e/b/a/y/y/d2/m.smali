.class public Le/b/a/y/y/d2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/w0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/y/w0<",
        "Ljava/net/URL;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/y/w0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/w0<",
            "Le/b/a/y/y/i0;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/b/a/y/y/w0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/w0<",
            "Le/b/a/y/y/i0;",
            "Ljava/io/InputStream;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/y/d2/m;->a:Le/b/a/y/y/w0;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/y/v0;
    .locals 0

    .line 1
    check-cast p1, Ljava/net/URL;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/y/d2/m;->a(Ljava/net/URL;IILe/b/a/y/r;)Le/b/a/y/y/v0;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/net/URL;IILe/b/a/y/r;)Le/b/a/y/y/v0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "II",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/y/v0<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Le/b/a/y/y/d2/m;->a:Le/b/a/y/y/w0;

    new-instance v1, Le/b/a/y/y/i0;

    invoke-direct {v1, p1}, Le/b/a/y/y/i0;-><init>(Ljava/net/URL;)V

    invoke-interface {v0, v1, p2, p3, p4}, Le/b/a/y/y/w0;->a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/y/v0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 2
    check-cast p1, Ljava/net/URL;

    invoke-virtual {p0, p1}, Le/b/a/y/y/d2/m;->a(Ljava/net/URL;)Z

    move-result p1

    return p1
.end method

.method public a(Ljava/net/URL;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
