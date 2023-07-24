.class public final Le/b/a/y/y/d0;
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
.field public final b:Ljava/io/File;

.field public final c:Le/b/a/y/y/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/e0<",
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
.method public constructor <init>(Ljava/io/File;Le/b/a/y/y/e0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Le/b/a/y/y/e0<",
            "TData;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/y/d0;->b:Ljava/io/File;

    .line 3
    iput-object p2, p0, Le/b/a/y/y/d0;->c:Le/b/a/y/y/e0;

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

    .line 6
    iget-object v0, p0, Le/b/a/y/y/d0;->c:Le/b/a/y/y/e0;

    invoke-interface {v0}, Le/b/a/y/y/e0;->a()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public a(Le/b/a/n;Le/b/a/y/w/d;)V
    .locals 2
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
    iget-object p1, p0, Le/b/a/y/y/d0;->c:Le/b/a/y/y/e0;

    iget-object v0, p0, Le/b/a/y/y/d0;->b:Ljava/io/File;

    invoke-interface {p1, v0}, Le/b/a/y/y/e0;->a(Ljava/io/File;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Le/b/a/y/y/d0;->d:Ljava/lang/Object;

    .line 2
    invoke-interface {p2, p1}, Le/b/a/y/w/d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 v0, 0x3

    const-string v1, "FileLoader"

    .line 3
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Failed to open file"

    .line 4
    invoke-static {v1, v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 5
    :cond_0
    invoke-interface {p2, p1}, Le/b/a/y/w/d;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/y/y/d0;->d:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/y/y/d0;->c:Le/b/a/y/y/e0;

    invoke-interface {v1, v0}, Le/b/a/y/y/e0;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
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
