.class public Le/b/a/y/y/d2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/x0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/y/x0<",
        "Ljava/net/URL;",
        "Ljava/io/InputStream;",
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
.method public a(Le/b/a/y/y/g1;)Le/b/a/y/y/w0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/g1;",
            ")",
            "Le/b/a/y/y/w0<",
            "Ljava/net/URL;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/b/a/y/y/d2/m;

    const-class v1, Le/b/a/y/y/i0;

    const-class v2, Ljava/io/InputStream;

    invoke-virtual {p1, v1, v2}, Le/b/a/y/y/g1;->a(Ljava/lang/Class;Ljava/lang/Class;)Le/b/a/y/y/w0;

    move-result-object p1

    invoke-direct {v0, p1}, Le/b/a/y/y/d2/m;-><init>(Le/b/a/y/y/w0;)V

    return-object v0
.end method
