.class public abstract Le/f/a/d/a/e/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/a/d/a/i/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/i/o<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Le/f/a/d/a/e/b;->b:Le/f/a/d/a/i/o;

    return-void
.end method

.method public constructor <init>(Le/f/a/d/a/i/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/i/o<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/e/b;->b:Le/f/a/d/a/i/o;

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public final b()Le/f/a/d/a/i/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/d/a/i/o<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/e/b;->b:Le/f/a/d/a/i/o;

    return-object v0
.end method

.method public final run()V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Le/f/a/d/a/e/b;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Le/f/a/d/a/e/b;->b:Le/f/a/d/a/i/o;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Le/f/a/d/a/i/o;->b(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method
