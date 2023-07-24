.class public final synthetic Le/f/a/b/b/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/a/b/h/h;


# direct methods
.method public constructor <init>(Le/f/a/b/h/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/b/b/z;->b:Le/f/a/b/h/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le/f/a/b/b/z;->b:Le/f/a/b/h/h;

    invoke-static {v0}, Le/f/a/b/b/e;->a(Le/f/a/b/h/h;)V

    return-void
.end method
