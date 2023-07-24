.class public final synthetic Le/f/a/b/b/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/a/b/b/l;

.field public final c:Le/f/a/b/b/v;


# direct methods
.method public constructor <init>(Le/f/a/b/b/l;Le/f/a/b/b/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/b/b/r;->b:Le/f/a/b/b/l;

    iput-object p2, p0, Le/f/a/b/b/r;->c:Le/f/a/b/b/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/a/b/b/r;->b:Le/f/a/b/b/l;

    iget-object v1, p0, Le/f/a/b/b/r;->c:Le/f/a/b/b/v;

    .line 2
    iget v1, v1, Le/f/a/b/b/v;->a:I

    invoke-virtual {v0, v1}, Le/f/a/b/b/l;->a(I)V

    return-void
.end method
