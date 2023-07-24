.class public final synthetic Le/f/a/b/b/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/a/b/b/l;


# direct methods
.method public constructor <init>(Le/f/a/b/b/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/b/b/s;->b:Le/f/a/b/b/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/f/a/b/b/s;->b:Le/f/a/b/b/l;

    const/4 v1, 0x2

    const-string v2, "Service disconnected"

    .line 2
    invoke-virtual {v0, v1, v2}, Le/f/a/b/b/l;->a(ILjava/lang/String;)V

    return-void
.end method
