.class public final Ld/a/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/t;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/t<",
        "Ljava/io/InputStream;",
        "Le/c/a/a2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;IILe/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "II",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/x/y0<",
            "Le/c/a/a2;",
            ">;"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p4, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    :try_start_0
    invoke-static {p1}, Le/c/a/a2;->a(Ljava/io/InputStream;)Le/c/a/a2;

    move-result-object p1

    const-string p4, "svg"

    .line 4
    invoke-static {p1, p4}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Le/c/a/a2;->c(F)V

    int-to-float p2, p3

    .line 5
    invoke-virtual {p1, p2}, Le/c/a/a2;->b(F)V

    .line 6
    new-instance p2, Le/b/a/y/z/c;

    invoke-direct {p2, p1}, Le/b/a/y/z/c;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/caverock/androidsvg/SVGParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    .line 7
    new-instance p2, Ljava/io/IOException;

    const-string p3, "Cannot load SVG from stream"

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public bridge synthetic a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2, p3, p4}, Ld/a/a/a/b;->a(Ljava/io/InputStream;IILe/b/a/y/r;)Le/b/a/y/x/y0;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/io/InputStream;Le/b/a/y/r;)Z
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "options"

    invoke-static {p2, p1}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;Le/b/a/y/r;)Z
    .locals 0

    .line 2
    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2}, Ld/a/a/a/b;->a(Ljava/io/InputStream;Le/b/a/y/r;)Z

    move-result p1

    return p1
.end method
