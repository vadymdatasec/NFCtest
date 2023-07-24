.class public final Le/b/a/y/w/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/w/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/w/f<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/x/f1/b;


# direct methods
.method public constructor <init>(Le/b/a/y/x/f1/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/w/q;->a:Le/b/a/y/x/f1/b;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;)Le/b/a/y/w/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            ")",
            "Le/b/a/y/w/g<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Le/b/a/y/w/r;

    iget-object v1, p0, Le/b/a/y/w/q;->a:Le/b/a/y/x/f1/b;

    invoke-direct {v0, p1, v1}, Le/b/a/y/w/r;-><init>(Ljava/io/InputStream;Le/b/a/y/x/f1/b;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Le/b/a/y/w/g;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1}, Le/b/a/y/w/q;->a(Ljava/io/InputStream;)Le/b/a/y/w/g;

    move-result-object p1

    return-object p1
.end method

.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .line 3
    const-class v0, Ljava/io/InputStream;

    return-object v0
.end method
