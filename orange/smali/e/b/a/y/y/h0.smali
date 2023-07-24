.class public Le/b/a/y/y/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/w0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/y/w0<",
        "Ljava/io/File;",
        "TData;>;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/y/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/e0<",
            "TData;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/b/a/y/y/e0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/e0<",
            "TData;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/y/h0;->a:Le/b/a/y/y/e0;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;IILe/b/a/y/r;)Le/b/a/y/y/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "II",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/y/v0<",
            "TData;>;"
        }
    .end annotation

    .line 3
    new-instance p2, Le/b/a/y/y/v0;

    new-instance p3, Le/b/a/d0/d;

    invoke-direct {p3, p1}, Le/b/a/d0/d;-><init>(Ljava/lang/Object;)V

    new-instance p4, Le/b/a/y/y/d0;

    iget-object v0, p0, Le/b/a/y/y/h0;->a:Le/b/a/y/y/e0;

    invoke-direct {p4, p1, v0}, Le/b/a/y/y/d0;-><init>(Ljava/io/File;Le/b/a/y/y/e0;)V

    invoke-direct {p2, p3, p4}, Le/b/a/y/y/v0;-><init>(Le/b/a/y/n;Le/b/a/y/w/e;)V

    return-object p2
.end method

.method public bridge synthetic a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/y/v0;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/y/h0;->a(Ljava/io/File;IILe/b/a/y/r;)Le/b/a/y/y/v0;

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

    invoke-virtual {p0, p1}, Le/b/a/y/y/h0;->a(Ljava/io/File;)Z

    move-result p1

    return p1
.end method
