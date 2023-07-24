.class public Le/b/a/y/z/e/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/z/e/w;


# instance fields
.field public final a:Le/b/a/y/z/e/m0;

.field public final b:Le/b/a/e0/f;


# direct methods
.method public constructor <init>(Le/b/a/y/z/e/m0;Le/b/a/e0/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/z/e/o0;->a:Le/b/a/y/z/e/m0;

    .line 3
    iput-object p2, p0, Le/b/a/y/z/e/o0;->b:Le/b/a/e0/f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/z/e/o0;->a:Le/b/a/y/z/e/m0;

    invoke-virtual {v0}, Le/b/a/y/z/e/m0;->c()V

    return-void
.end method

.method public a(Le/b/a/y/x/f1/g;Landroid/graphics/Bitmap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/b/a/y/z/e/o0;->b:Le/b/a/e0/f;

    invoke-virtual {v0}, Le/b/a/e0/f;->c()Ljava/io/IOException;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    .line 3
    invoke-interface {p1, p2}, Le/b/a/y/x/f1/g;->a(Landroid/graphics/Bitmap;)V

    .line 4
    :cond_0
    throw v0

    :cond_1
    return-void
.end method
