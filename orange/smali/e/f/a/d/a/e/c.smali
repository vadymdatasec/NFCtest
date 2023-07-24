.class public final synthetic Le/f/a/d/a/e/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final a:Le/f/a/d/a/e/k;


# direct methods
.method public constructor <init>(Le/f/a/d/a/e/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/e/c;->a:Le/f/a/d/a/e/k;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, Le/f/a/d/a/e/c;->a:Le/f/a/d/a/e/k;

    invoke-virtual {v0}, Le/f/a/d/a/e/k;->c()V

    return-void
.end method
