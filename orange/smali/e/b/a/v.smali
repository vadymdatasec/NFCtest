.class public abstract Le/b/a/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<CHI",
        "LD:Le/b/a/v<",
        "TCHI",
        "LD;",
        "TTranscodeType;>;TranscodeType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# instance fields
.field public b:Le/b/a/c0/p/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/c0/p/e<",
            "-TTranscodeType;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Le/b/a/c0/p/b;->a()Le/b/a/c0/p/e;

    move-result-object v0

    iput-object v0, p0, Le/b/a/v;->b:Le/b/a/c0/p/e;

    return-void
.end method


# virtual methods
.method public final a()Le/b/a/c0/p/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/b/a/c0/p/e<",
            "-TTranscodeType;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/v;->b:Le/b/a/c0/p/e;

    return-object v0
.end method

.method public final clone()Le/b/a/v;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TCHI",
            "LD;"
        }
    .end annotation

    .line 2
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/v;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 3
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/b/a/v;->clone()Le/b/a/v;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Le/b/a/v;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Le/b/a/v;

    .line 3
    iget-object v0, p0, Le/b/a/v;->b:Le/b/a/c0/p/e;

    iget-object p1, p1, Le/b/a/v;->b:Le/b/a/c0/p/e;

    invoke-static {v0, p1}, Le/b/a/e0/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/v;->b:Le/b/a/c0/p/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
