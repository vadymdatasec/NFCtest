.class public Le/b/a/y/x/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/w/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/w/d<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Le/b/a/y/y/v0;

.field public final synthetic c:Le/b/a/y/x/e1;


# direct methods
.method public constructor <init>(Le/b/a/y/x/e1;Le/b/a/y/y/v0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/y/x/d1;->c:Le/b/a/y/x/e1;

    iput-object p2, p0, Le/b/a/y/x/d1;->b:Le/b/a/y/y/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 2

    .line 3
    iget-object v0, p0, Le/b/a/y/x/d1;->c:Le/b/a/y/x/e1;

    iget-object v1, p0, Le/b/a/y/x/d1;->b:Le/b/a/y/y/v0;

    invoke-virtual {v0, v1}, Le/b/a/y/x/e1;->a(Le/b/a/y/y/v0;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Le/b/a/y/x/d1;->c:Le/b/a/y/x/e1;

    iget-object v1, p0, Le/b/a/y/x/d1;->b:Le/b/a/y/y/v0;

    invoke-virtual {v0, v1, p1}, Le/b/a/y/x/e1;->a(Le/b/a/y/y/v0;Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/y/x/d1;->c:Le/b/a/y/x/e1;

    iget-object v1, p0, Le/b/a/y/x/d1;->b:Le/b/a/y/y/v0;

    invoke-virtual {v0, v1}, Le/b/a/y/x/e1;->a(Le/b/a/y/y/v0;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/b/a/y/x/d1;->c:Le/b/a/y/x/e1;

    iget-object v1, p0, Le/b/a/y/x/d1;->b:Le/b/a/y/y/v0;

    invoke-virtual {v0, v1, p1}, Le/b/a/y/x/e1;->a(Le/b/a/y/y/v0;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
