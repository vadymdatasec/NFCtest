.class public Le/b/a/y/y/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/w0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/y/w0<",
        "Ljava/io/File;",
        "Ljava/nio/ByteBuffer;",
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
.method public a(Ljava/io/File;IILe/b/a/y/r;)Le/b/a/y/y/v0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "II",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/y/v0<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    .line 3
    new-instance p2, Le/b/a/y/y/v0;

    new-instance p3, Le/b/a/d0/d;

    invoke-direct {p3, p1}, Le/b/a/d0/d;-><init>(Ljava/lang/Object;)V

    new-instance p4, Le/b/a/y/y/m;

    invoke-direct {p4, p1}, Le/b/a/y/y/m;-><init>(Ljava/io/File;)V

    invoke-direct {p2, p3, p4}, Le/b/a/y/y/v0;-><init>(Le/b/a/y/n;Le/b/a/y/w/e;)V

    return-object p2
.end method

.method public bridge synthetic a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/y/v0;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/y/o;->a(Ljava/io/File;IILe/b/a/y/r;)Le/b/a/y/y/v0;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/io/File;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 2
    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, Le/b/a/y/y/o;->a(Ljava/io/File;)Z

    move-result p1

    return p1
.end method
