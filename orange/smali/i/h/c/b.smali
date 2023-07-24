.class public abstract Li/h/c/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li/j/a;
.implements Ljava/io/Serializable;


# static fields
.field public static final h:Ljava/lang/Object;


# instance fields
.field public transient b:Li/j/a;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Class;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Li/h/c/a;->a()Li/h/c/a;

    move-result-object v0

    sput-object v0, Li/h/c/b;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li/h/c/b;->c:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Li/h/c/b;->d:Ljava/lang/Class;

    .line 4
    iput-object p3, p0, Li/h/c/b;->e:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Li/h/c/b;->f:Ljava/lang/String;

    .line 6
    iput-boolean p5, p0, Li/h/c/b;->g:Z

    return-void
.end method


# virtual methods
.method public a()Li/j/a;
    .locals 1

    .line 1
    iget-object v0, p0, Li/h/c/b;->b:Li/j/a;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Li/h/c/b;->b()Li/j/a;

    .line 3
    iput-object p0, p0, Li/h/c/b;->b:Li/j/a;

    move-object v0, p0

    :cond_0
    return-object v0
.end method

.method public abstract b()Li/j/a;
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Li/h/c/b;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Li/h/c/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e()Li/j/c;
    .locals 2

    .line 1
    iget-object v0, p0, Li/h/c/b;->d:Ljava/lang/Class;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Li/h/c/b;->g:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Li/h/c/n;->b(Ljava/lang/Class;)Li/j/c;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {v0}, Li/h/c/n;->a(Ljava/lang/Class;)Li/j/b;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Li/h/c/b;->f:Ljava/lang/String;

    return-object v0
.end method
