.class public final Le/b/a/y/y/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/x0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Model:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/y/x0<",
        "TModel;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/y/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/p<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/b/a/y/y/r;

    invoke-direct {v0, p0}, Le/b/a/y/y/r;-><init>(Le/b/a/y/y/s;)V

    iput-object v0, p0, Le/b/a/y/y/s;->a:Le/b/a/y/y/p;

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/y/g1;)Le/b/a/y/y/w0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/g1;",
            ")",
            "Le/b/a/y/y/w0<",
            "TModel;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Le/b/a/y/y/t;

    iget-object v0, p0, Le/b/a/y/y/s;->a:Le/b/a/y/y/p;

    invoke-direct {p1, v0}, Le/b/a/y/y/t;-><init>(Le/b/a/y/y/p;)V

    return-object p1
.end method
