.class public Le/b/a/y/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/l;


# instance fields
.field public final synthetic a:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/y/f;->a:Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Le/b/a/y/f;->a:Ljava/nio/ByteBuffer;

    invoke-interface {p1, v0}, Lcom/bumptech/glide/load/ImageHeaderParser;->a(Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    iget-object v0, p0, Le/b/a/y/f;->a:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Le/b/a/e0/c;->b(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Le/b/a/y/f;->a:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Le/b/a/e0/c;->b(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 3
    throw p1
.end method
