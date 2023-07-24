.class public Lc/o/a/b;
.super Lc/o/a/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/o/a/b$b;,
        Lc/o/a/b$a;
    }
.end annotation


# instance fields
.field public final a:Lc/n/j;

.field public final b:Lc/o/a/b$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lc/n/j;Lc/n/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/o/a/a;-><init>()V

    .line 2
    iput-object p1, p0, Lc/o/a/b;->a:Lc/n/j;

    .line 3
    invoke-static {p2}, Lc/o/a/b$b;->a(Lc/n/x;)Lc/o/a/b$b;

    move-result-object p1

    iput-object p1, p0, Lc/o/a/b;->b:Lc/o/a/b$b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/o/a/b;->b:Lc/o/a/b$b;

    invoke-virtual {v0}, Lc/o/a/b$b;->c()V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    iget-object v0, p0, Lc/o/a/b;->b:Lc/o/a/b$b;

    invoke-virtual {v0, p1, p2, p3, p4}, Lc/o/a/b$b;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "LoaderManager{"

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    iget-object v1, p0, Lc/o/a/b;->a:Lc/n/j;

    invoke-static {v1, v0}, Lc/h/m/b;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    const-string v1, "}}"

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
