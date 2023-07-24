.class public Le/b/a/y/y/d2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/w0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/y/w0<",
        "Landroid/net/Uri;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Le/b/a/y/y/d2/f;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;IILe/b/a/y/r;)Le/b/a/y/y/v0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "II",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/y/v0<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .line 3
    invoke-static {p2, p3}, Le/b/a/y/w/w/b;->a(II)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p4}, Le/b/a/y/y/d2/f;->a(Le/b/a/y/r;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 4
    new-instance p2, Le/b/a/y/y/v0;

    new-instance p3, Le/b/a/d0/d;

    invoke-direct {p3, p1}, Le/b/a/d0/d;-><init>(Ljava/lang/Object;)V

    iget-object p4, p0, Le/b/a/y/y/d2/f;->a:Landroid/content/Context;

    invoke-static {p4, p1}, Le/b/a/y/w/w/e;->b(Landroid/content/Context;Landroid/net/Uri;)Le/b/a/y/w/w/e;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Le/b/a/y/y/v0;-><init>(Le/b/a/y/n;Le/b/a/y/w/e;)V

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/y/v0;
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/y/d2/f;->a(Landroid/net/Uri;IILe/b/a/y/r;)Le/b/a/y/y/v0;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/net/Uri;)Z
    .locals 0

    .line 7
    invoke-static {p1}, Le/b/a/y/w/w/b;->c(Landroid/net/Uri;)Z

    move-result p1

    return p1
.end method

.method public final a(Le/b/a/y/r;)Z
    .locals 4

    .line 5
    sget-object v0, Le/b/a/y/z/e/d1;->d:Le/b/a/y/q;

    invoke-virtual {p1, v0}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 2
    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, Le/b/a/y/y/d2/f;->a(Landroid/net/Uri;)Z

    move-result p1

    return p1
.end method
