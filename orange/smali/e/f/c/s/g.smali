.class public final synthetic Le/f/c/s/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/c/s/j;

.field public final c:Z


# direct methods
.method public constructor <init>(Le/f/c/s/j;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/s/g;->b:Le/f/c/s/j;

    iput-boolean p2, p0, Le/f/c/s/g;->c:Z

    return-void
.end method

.method public static a(Le/f/c/s/j;Z)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Le/f/c/s/g;

    invoke-direct {v0, p0, p1}, Le/f/c/s/g;-><init>(Le/f/c/s/j;Z)V

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Le/f/c/s/g;->b:Le/f/c/s/j;

    iget-boolean v1, p0, Le/f/c/s/g;->c:Z

    invoke-static {v0, v1}, Le/f/c/s/j;->a(Le/f/c/s/j;Z)V

    return-void
.end method
