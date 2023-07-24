.class public final Le/b/a/y/y/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/w0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Model:",
        "Ljava/lang/Object;",
        "Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/y/w0<",
        "TModel;TData;>;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/y/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/p<",
            "TData;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/b/a/y/y/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/p<",
            "TData;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/y/t;->a:Le/b/a/y/y/p;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/y/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;II",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/y/v0<",
            "TData;>;"
        }
    .end annotation

    .line 1
    new-instance p2, Le/b/a/y/y/v0;

    new-instance p3, Le/b/a/d0/d;

    invoke-direct {p3, p1}, Le/b/a/d0/d;-><init>(Ljava/lang/Object;)V

    new-instance p4, Le/b/a/y/y/q;

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Le/b/a/y/y/t;->a:Le/b/a/y/y/p;

    invoke-direct {p4, p1, v0}, Le/b/a/y/y/q;-><init>(Ljava/lang/String;Le/b/a/y/y/p;)V

    invoke-direct {p2, p3, p4}, Le/b/a/y/y/v0;-><init>(Le/b/a/y/n;Le/b/a/y/w/e;)V

    return-object p2
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;)Z"
        }
    .end annotation

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "data:image"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
