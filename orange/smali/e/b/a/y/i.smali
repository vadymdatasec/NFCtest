.class public Le/b/a/y/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/k;


# instance fields
.field public final synthetic a:Ljava/io/InputStream;

.field public final synthetic b:Le/b/a/y/x/f1/b;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Le/b/a/y/x/f1/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/y/i;->a:Ljava/io/InputStream;

    iput-object p2, p0, Le/b/a/y/i;->b:Le/b/a/y/x/f1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/load/ImageHeaderParser;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Le/b/a/y/i;->a:Ljava/io/InputStream;

    iget-object v1, p0, Le/b/a/y/i;->b:Le/b/a/y/x/f1/b;

    invoke-interface {p1, v0, v1}, Lcom/bumptech/glide/load/ImageHeaderParser;->a(Ljava/io/InputStream;Le/b/a/y/x/f1/b;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    iget-object v0, p0, Le/b/a/y/i;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Le/b/a/y/i;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    .line 3
    throw p1
.end method
