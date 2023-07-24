.class public final Le/b/a/y/y/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/w/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/w/e<",
        "Ljava/nio/ByteBuffer;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/y/m;->b:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    .line 6
    const-class v0, Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public a(Le/b/a/n;Le/b/a/y/w/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/n;",
            "Le/b/a/y/w/d<",
            "-",
            "Ljava/nio/ByteBuffer;",
            ">;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object p1, p0, Le/b/a/y/y/m;->b:Ljava/io/File;

    invoke-static {p1}, Le/b/a/e0/c;->a(Ljava/io/File;)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 2
    invoke-interface {p2, p1}, Le/b/a/y/w/d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 v0, 0x3

    const-string v1, "ByteBufferFileLoader"

    .line 3
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Failed to obtain ByteBuffer for file"

    .line 4
    invoke-static {v1, v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 5
    :cond_0
    invoke-interface {p2, p1}, Le/b/a/y/w/d;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public b()V
    .locals 0

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
