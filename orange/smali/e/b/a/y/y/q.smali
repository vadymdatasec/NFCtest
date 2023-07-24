.class public final Le/b/a/y/y/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/w/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/w/e<",
        "TData;>;"
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Le/b/a/y/y/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/p<",
            "TData;>;"
        }
    .end annotation
.end field

.field public d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TData;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Le/b/a/y/y/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Le/b/a/y/y/p<",
            "TData;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/y/q;->b:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Le/b/a/y/y/q;->c:Le/b/a/y/y/p;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TData;>;"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Le/b/a/y/y/q;->c:Le/b/a/y/y/p;

    invoke-interface {v0}, Le/b/a/y/y/p;->a()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public a(Le/b/a/n;Le/b/a/y/w/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/n;",
            "Le/b/a/y/w/d<",
            "-TData;>;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object p1, p0, Le/b/a/y/y/q;->c:Le/b/a/y/y/p;

    iget-object v0, p0, Le/b/a/y/y/q;->b:Ljava/lang/String;

    invoke-interface {p1, v0}, Le/b/a/y/y/p;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Le/b/a/y/y/q;->d:Ljava/lang/Object;

    .line 2
    invoke-interface {p2, p1}, Le/b/a/y/w/d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-interface {p2, p1}, Le/b/a/y/w/d;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Le/b/a/y/y/q;->c:Le/b/a/y/y/p;

    iget-object v1, p0, Le/b/a/y/y/q;->d:Ljava/lang/Object;

    invoke-interface {v0, v1}, Le/b/a/y/y/p;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public c()Le/b/a/y/a;
    .locals 1

    .line 1
    sget-object v0, Le/b/a/y/a;->b:Le/b/a/y/a;

    return-object v0
.end method

.method public cancel()V
    .locals 0

    return-void
.end method
