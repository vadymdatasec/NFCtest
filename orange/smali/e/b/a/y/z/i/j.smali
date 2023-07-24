.class public Le/b/a/y/z/i/j;
.super Le/b/a/c0/o/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/b/a/c0/o/c<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final e:Landroid/os/Handler;

.field public final f:I

.field public final g:J

.field public h:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/os/Handler;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/b/a/c0/o/c;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/z/i/j;->e:Landroid/os/Handler;

    .line 3
    iput p2, p0, Le/b/a/y/z/i/j;->f:I

    .line 4
    iput-wide p3, p0, Le/b/a/y/z/i/j;->g:J

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;Le/b/a/c0/p/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Le/b/a/c0/p/d<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Le/b/a/y/z/i/j;->h:Landroid/graphics/Bitmap;

    .line 3
    iget-object p1, p0, Le/b/a/y/z/i/j;->e:Landroid/os/Handler;

    const/4 p2, 0x1

    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 4
    iget-object p2, p0, Le/b/a/y/z/i/j;->e:Landroid/os/Handler;

    iget-wide v0, p0, Le/b/a/y/z/i/j;->g:J

    invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Le/b/a/c0/p/d;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Le/b/a/y/z/i/j;->a(Landroid/graphics/Bitmap;Le/b/a/c0/p/d;)V

    return-void
.end method

.method public c(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput-object p1, p0, Le/b/a/y/z/i/j;->h:Landroid/graphics/Bitmap;

    return-void
.end method

.method public d()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/z/i/j;->h:Landroid/graphics/Bitmap;

    return-object v0
.end method
