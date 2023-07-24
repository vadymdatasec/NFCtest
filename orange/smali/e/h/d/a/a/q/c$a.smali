.class public Le/h/d/a/a/q/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/h/d/a/a/q/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public b:I

.field public c:I

.field public d:Z


# direct methods
.method public constructor <init>(IIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Le/h/d/a/a/q/c$a;->b:I

    .line 3
    iput p2, p0, Le/h/d/a/a/q/c$a;->c:I

    .line 4
    iput-boolean p3, p0, Le/h/d/a/a/q/c$a;->d:Z

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Le/h/d/a/a/q/c$a;->b:I

    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Le/h/d/a/a/q/c$a;->c:I

    return v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/h/d/a/a/q/c$a;->d:Z

    return v0
.end method
