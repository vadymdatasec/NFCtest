.class public Le/b/a/z/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:Le/b/a/z/c0;


# direct methods
.method public constructor <init>(Le/b/a/z/c0;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/z/b0;->c:Le/b/a/z/c0;

    iput-boolean p2, p0, Le/b/a/z/b0;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/z/b0;->c:Le/b/a/z/c0;

    iget-boolean v1, p0, Le/b/a/z/b0;->b:Z

    invoke-virtual {v0, v1}, Le/b/a/z/c0;->a(Z)V

    return-void
.end method
