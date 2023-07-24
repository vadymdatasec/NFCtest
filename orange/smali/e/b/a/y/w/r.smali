.class public final Le/b/a/y/w/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/w/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/w/g<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/z/e/m0;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Le/b/a/y/x/f1/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/b/a/y/z/e/m0;

    invoke-direct {v0, p1, p2}, Le/b/a/y/z/e/m0;-><init>(Ljava/io/InputStream;Le/b/a/y/x/f1/b;)V

    iput-object v0, p0, Le/b/a/y/w/r;->a:Le/b/a/y/z/e/m0;

    const/high16 p1, 0x500000

    .line 3
    invoke-virtual {v0, p1}, Le/b/a/y/z/e/m0;->mark(I)V

    return-void
.end method


# virtual methods
.method public a()Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/b/a/y/w/r;->a:Le/b/a/y/z/e/m0;

    invoke-virtual {v0}, Le/b/a/y/z/e/m0;->reset()V

    .line 3
    iget-object v0, p0, Le/b/a/y/w/r;->a:Le/b/a/y/z/e/m0;

    return-object v0
.end method

.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/b/a/y/w/r;->a()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/w/r;->a:Le/b/a/y/z/e/m0;

    invoke-virtual {v0}, Le/b/a/y/z/e/m0;->l()V

    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/w/r;->a:Le/b/a/y/z/e/m0;

    invoke-virtual {v0}, Le/b/a/y/z/e/m0;->c()V

    return-void
.end method
