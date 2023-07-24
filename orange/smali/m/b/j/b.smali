.class public Lm/b/j/b;
.super Lm/b/j/j3;
.source "SourceFile"


# static fields
.field public static final A:[Ljava/lang/String;

.field public static final B:[Ljava/lang/String;

.field public static final C:[Ljava/lang/String;

.field public static final D:[Ljava/lang/String;

.field public static final x:[Ljava/lang/String;

.field public static final y:[Ljava/lang/String;

.field public static final z:[Ljava/lang/String;


# instance fields
.field public k:Lm/b/j/b0;

.field public l:Lm/b/j/b0;

.field public m:Z

.field public n:Lm/b/i/l;

.field public o:Lm/b/i/q;

.field public p:Lm/b/i/l;

.field public q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lm/b/i/l;",
            ">;"
        }
    .end annotation
.end field

.field public r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public s:Lm/b/j/m0;

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 80

    const-string v0, "applet"

    const-string v1, "caption"

    const-string v2, "html"

    const-string v3, "table"

    const-string v4, "td"

    const-string v5, "th"

    const-string v6, "marquee"

    const-string v7, "object"

    .line 1
    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lm/b/j/b;->x:[Ljava/lang/String;

    const-string v0, "ol"

    const-string v1, "ul"

    .line 2
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lm/b/j/b;->y:[Ljava/lang/String;

    const-string v0, "button"

    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lm/b/j/b;->z:[Ljava/lang/String;

    const-string v0, "html"

    const-string v1, "table"

    .line 4
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lm/b/j/b;->A:[Ljava/lang/String;

    const-string v0, "optgroup"

    const-string v1, "option"

    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lm/b/j/b;->B:[Ljava/lang/String;

    const-string v1, "dd"

    const-string v2, "dt"

    const-string v3, "li"

    const-string v4, "option"

    const-string v5, "optgroup"

    const-string v6, "p"

    const-string v7, "rp"

    const-string v8, "rt"

    .line 6
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lm/b/j/b;->C:[Ljava/lang/String;

    const-string v1, "address"

    const-string v2, "applet"

    const-string v3, "area"

    const-string v4, "article"

    const-string v5, "aside"

    const-string v6, "base"

    const-string v7, "basefont"

    const-string v8, "bgsound"

    const-string v9, "blockquote"

    const-string v10, "body"

    const-string v11, "br"

    const-string v12, "button"

    const-string v13, "caption"

    const-string v14, "center"

    const-string v15, "col"

    const-string v16, "colgroup"

    const-string v17, "command"

    const-string v18, "dd"

    const-string v19, "details"

    const-string v20, "dir"

    const-string v21, "div"

    const-string v22, "dl"

    const-string v23, "dt"

    const-string v24, "embed"

    const-string v25, "fieldset"

    const-string v26, "figcaption"

    const-string v27, "figure"

    const-string v28, "footer"

    const-string v29, "form"

    const-string v30, "frame"

    const-string v31, "frameset"

    const-string v32, "h1"

    const-string v33, "h2"

    const-string v34, "h3"

    const-string v35, "h4"

    const-string v36, "h5"

    const-string v37, "h6"

    const-string v38, "head"

    const-string v39, "header"

    const-string v40, "hgroup"

    const-string v41, "hr"

    const-string v42, "html"

    const-string v43, "iframe"

    const-string v44, "img"

    const-string v45, "input"

    const-string v46, "isindex"

    const-string v47, "li"

    const-string v48, "link"

    const-string v49, "listing"

    const-string v50, "marquee"

    const-string v51, "menu"

    const-string v52, "meta"

    const-string v53, "nav"

    const-string v54, "noembed"

    const-string v55, "noframes"

    const-string v56, "noscript"

    const-string v57, "object"

    const-string v58, "ol"

    const-string v59, "p"

    const-string v60, "param"

    const-string v61, "plaintext"

    const-string v62, "pre"

    const-string v63, "script"

    const-string v64, "section"

    const-string v65, "select"

    const-string v66, "style"

    const-string v67, "summary"

    const-string v68, "table"

    const-string v69, "tbody"

    const-string v70, "td"

    const-string v71, "textarea"

    const-string v72, "tfoot"

    const-string v73, "th"

    const-string v74, "thead"

    const-string v75, "title"

    const-string v76, "tr"

    const-string v77, "ul"

    const-string v78, "wbr"

    const-string v79, "xmp"

    .line 7
    filled-new-array/range {v1 .. v79}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lm/b/j/b;->D:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lm/b/j/j3;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lm/b/j/b;->m:Z

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lm/b/j/b;->r:Ljava/util/List;

    .line 5
    new-instance v1, Lm/b/j/m0;

    invoke-direct {v1}, Lm/b/j/m0;-><init>()V

    iput-object v1, p0, Lm/b/j/b;->s:Lm/b/j/m0;

    const/4 v1, 0x1

    .line 6
    iput-boolean v1, p0, Lm/b/j/b;->t:Z

    .line 7
    iput-boolean v0, p0, Lm/b/j/b;->u:Z

    .line 8
    iput-boolean v0, p0, Lm/b/j/b;->v:Z

    const/4 v0, 0x0

    .line 9
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lm/b/j/b;->w:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public A()Lm/b/j/b0;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/b;->k:Lm/b/j/b0;

    return-object v0
.end method

.method public a(Lm/b/i/l;)Lm/b/i/l;
    .locals 2

    .line 33
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 34
    iget-object v1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/l;

    if-ne v1, p1, :cond_0

    .line 35
    iget-object p1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm/b/i/l;

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public a(Lm/b/j/n0;)Lm/b/i/l;
    .locals 4

    .line 8
    invoke-virtual {p1}, Lm/b/j/o0;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {p0, p1}, Lm/b/j/b;->b(Lm/b/j/n0;)Lm/b/i/l;

    move-result-object p1

    .line 10
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    iget-object v0, p0, Lm/b/j/j3;->b:Lm/b/j/s0;

    sget-object v1, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {v0, v1}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    .line 12
    iget-object v0, p0, Lm/b/j/j3;->b:Lm/b/j/s0;

    iget-object v1, p0, Lm/b/j/b;->s:Lm/b/j/m0;

    invoke-virtual {v1}, Lm/b/j/o0;->l()Lm/b/j/o0;

    invoke-virtual {p1}, Lm/b/i/l;->C()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lm/b/j/o0;->d(Ljava/lang/String;)Lm/b/j/o0;

    invoke-virtual {v0, v1}, Lm/b/j/s0;->a(Lm/b/j/q0;)V

    return-object p1

    .line 13
    :cond_0
    new-instance v0, Lm/b/i/l;

    invoke-virtual {p1}, Lm/b/j/o0;->r()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lm/b/j/j3;->h:Lm/b/j/e0;

    invoke-static {v1, v2}, Lm/b/j/g0;->a(Ljava/lang/String;Lm/b/j/e0;)Lm/b/j/g0;

    move-result-object v1

    iget-object v2, p0, Lm/b/j/j3;->e:Ljava/lang/String;

    iget-object v3, p0, Lm/b/j/j3;->h:Lm/b/j/e0;

    iget-object p1, p1, Lm/b/j/o0;->j:Lm/b/i/b;

    invoke-virtual {v3, p1}, Lm/b/j/e0;->a(Lm/b/i/b;)Lm/b/i/b;

    invoke-direct {v0, v1, v2, p1}, Lm/b/i/l;-><init>(Lm/b/j/g0;Ljava/lang/String;Lm/b/i/b;)V

    .line 14
    invoke-virtual {p0, v0}, Lm/b/j/b;->b(Lm/b/i/l;)V

    return-object v0
.end method

.method public a(Lm/b/j/n0;Z)Lm/b/i/q;
    .locals 3

    .line 15
    invoke-virtual {p1}, Lm/b/j/o0;->r()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lm/b/j/j3;->h:Lm/b/j/e0;

    invoke-static {v0, v1}, Lm/b/j/g0;->a(Ljava/lang/String;Lm/b/j/e0;)Lm/b/j/g0;

    move-result-object v0

    .line 16
    new-instance v1, Lm/b/i/q;

    iget-object v2, p0, Lm/b/j/j3;->e:Ljava/lang/String;

    iget-object p1, p1, Lm/b/j/o0;->j:Lm/b/i/b;

    invoke-direct {v1, v0, v2, p1}, Lm/b/i/q;-><init>(Lm/b/j/g0;Ljava/lang/String;Lm/b/i/b;)V

    .line 17
    invoke-virtual {p0, v1}, Lm/b/j/b;->a(Lm/b/i/q;)V

    .line 18
    invoke-virtual {p0, v1}, Lm/b/j/b;->b(Lm/b/i/t;)V

    if-eqz p2, :cond_0

    .line 19
    iget-object p1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v1
.end method

.method public final a(Ljava/util/ArrayList;Lm/b/i/l;Lm/b/i/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lm/b/i/l;",
            ">;",
            "Lm/b/i/l;",
            "Lm/b/i/l;",
            ")V"
        }
    .end annotation

    .line 39
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 40
    :goto_0
    invoke-static {v0}, Lm/b/h/j;->b(Z)V

    .line 41
    invoke-virtual {p1, p2, p3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Lm/b/i/l;Lm/b/i/l;)V
    .locals 2

    .line 36
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, 0x1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 37
    :goto_0
    invoke-static {v1}, Lm/b/h/j;->b(Z)V

    .line 38
    iget-object v1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    add-int/2addr p1, v0

    invoke-virtual {v1, p1, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public a(Lm/b/i/q;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lm/b/j/b;->o:Lm/b/i/q;

    return-void
.end method

.method public a(Lm/b/i/t;)V
    .locals 3

    const-string v0, "table"

    .line 53
    invoke-virtual {p0, v0}, Lm/b/j/b;->e(Ljava/lang/String;)Lm/b/i/l;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 54
    invoke-virtual {v0}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 55
    invoke-virtual {v0}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object v1

    const/4 v2, 0x1

    move-object v2, v1

    const/4 v1, 0x1

    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {p0, v0}, Lm/b/j/b;->a(Lm/b/i/l;)Lm/b/i/l;

    move-result-object v2

    goto :goto_0

    .line 57
    :cond_1
    iget-object v2, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm/b/i/l;

    :goto_0
    if-eqz v1, :cond_2

    .line 58
    invoke-static {v0}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 59
    invoke-virtual {v0, p1}, Lm/b/i/l;->a(Lm/b/i/t;)Lm/b/i/l;

    goto :goto_1

    .line 60
    :cond_2
    invoke-virtual {v2, p1}, Lm/b/i/l;->f(Lm/b/i/t;)Lm/b/i/l;

    :goto_1
    return-void
.end method

.method public a(Lm/b/j/b0;)V
    .locals 6

    .line 6
    iget-object v0, p0, Lm/b/j/j3;->g:Lm/b/j/d0;

    invoke-virtual {v0}, Lm/b/j/d0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    iget-object v0, p0, Lm/b/j/j3;->g:Lm/b/j/d0;

    new-instance v1, Lm/b/j/c0;

    iget-object v2, p0, Lm/b/j/j3;->a:Lm/b/j/a;

    invoke-virtual {v2}, Lm/b/j/a;->o()I

    move-result v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lm/b/j/j3;->f:Lm/b/j/q0;

    invoke-virtual {v5}, Lm/b/j/q0;->m()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object p1, v3, v4

    const-string p1, "Unexpected token [%s] when in state [%s]"

    invoke-direct {v1, v2, p1, v3}, Lm/b/j/c0;-><init>(ILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public a(Lm/b/j/i0;)V
    .locals 2

    .line 22
    invoke-virtual {p0}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/i/l;->C()Ljava/lang/String;

    move-result-object v0

    const-string v1, "script"

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "style"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Lm/b/i/u;

    invoke-virtual {p1}, Lm/b/j/i0;->n()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lm/b/j/j3;->e:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lm/b/i/u;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    new-instance v0, Lm/b/i/e;

    invoke-virtual {p1}, Lm/b/j/i0;->n()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lm/b/j/j3;->e:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lm/b/i/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    :goto_1
    invoke-virtual {p0}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object p1

    invoke-virtual {p1, v0}, Lm/b/i/l;->f(Lm/b/i/t;)Lm/b/i/l;

    return-void
.end method

.method public a(Lm/b/j/j0;)V
    .locals 2

    .line 20
    new-instance v0, Lm/b/i/d;

    invoke-virtual {p1}, Lm/b/j/j0;->n()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lm/b/j/j3;->e:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lm/b/i/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0, v0}, Lm/b/j/b;->b(Lm/b/i/t;)V

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lm/b/j/b;->t:Z

    return-void
.end method

.method public final varargs a([Ljava/lang/String;)V
    .locals 3

    .line 29
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 30
    iget-object v1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/l;

    .line 31
    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v1

    const-string v2, "html"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 32
    :cond_0
    iget-object v1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public a(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 1

    .line 51
    sget-object v0, Lm/b/j/b;->x:[Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm/b/j/b;->a(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final a(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 2

    .line 42
    iget-object v0, p0, Lm/b/j/b;->w:[Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 43
    invoke-virtual {p0, v0, p2, p3}, Lm/b/j/b;->a([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final a(Ljava/util/ArrayList;Lm/b/i/l;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lm/b/i/l;",
            ">;",
            "Lm/b/i/l;",
            ")Z"
        }
    .end annotation

    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    .line 28
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm/b/i/l;

    if-ne v2, p2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public a(Lm/b/j/q0;)Z
    .locals 1

    .line 1
    iput-object p1, p0, Lm/b/j/j3;->f:Lm/b/j/q0;

    .line 2
    iget-object v0, p0, Lm/b/j/b;->k:Lm/b/j/b0;

    invoke-virtual {v0, p1, p0}, Lm/b/j/b0;->a(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

    return p1
.end method

.method public a(Lm/b/j/q0;Lm/b/j/b0;)Z
    .locals 0

    .line 3
    iput-object p1, p0, Lm/b/j/j3;->f:Lm/b/j/q0;

    .line 4
    invoke-virtual {p2, p1, p0}, Lm/b/j/b0;->a(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

    return p1
.end method

.method public final a([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 5

    .line 44
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_3

    .line 45
    iget-object v2, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm/b/i/l;

    .line 46
    invoke-virtual {v2}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v2

    .line 47
    invoke-static {v2, p1}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    return v1

    .line 48
    :cond_0
    invoke-static {v2, p2}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    return v4

    :cond_1
    if-eqz p3, :cond_2

    .line 49
    invoke-static {v2, p3}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    return v4

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    const-string p1, "Should not be reachable"

    .line 50
    invoke-static {p1}, Lm/b/h/j;->a(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Lm/b/j/d0;Lm/b/j/e0;)Lm/b/i/i;
    .locals 1

    .line 2
    sget-object v0, Lm/b/j/b0;->b:Lm/b/j/b0;

    iput-object v0, p0, Lm/b/j/b;->k:Lm/b/j/b0;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lm/b/j/b;->m:Z

    .line 4
    invoke-super {p0, p1, p2, p3, p4}, Lm/b/j/j3;->b(Ljava/lang/String;Ljava/lang/String;Lm/b/j/d0;Lm/b/j/e0;)Lm/b/i/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Lm/b/j/n0;)Lm/b/i/l;
    .locals 4

    .line 8
    invoke-virtual {p1}, Lm/b/j/o0;->r()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lm/b/j/j3;->h:Lm/b/j/e0;

    invoke-static {v0, v1}, Lm/b/j/g0;->a(Ljava/lang/String;Lm/b/j/e0;)Lm/b/j/g0;

    move-result-object v0

    .line 9
    new-instance v1, Lm/b/i/l;

    iget-object v2, p0, Lm/b/j/j3;->e:Ljava/lang/String;

    iget-object v3, p1, Lm/b/j/o0;->j:Lm/b/i/b;

    invoke-direct {v1, v0, v2, v3}, Lm/b/i/l;-><init>(Lm/b/j/g0;Ljava/lang/String;Lm/b/i/b;)V

    .line 10
    invoke-virtual {p0, v1}, Lm/b/j/b;->b(Lm/b/i/t;)V

    .line 11
    invoke-virtual {p1}, Lm/b/j/o0;->q()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 12
    invoke-virtual {v0}, Lm/b/j/g0;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 13
    invoke-virtual {v0}, Lm/b/j/g0;->g()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lm/b/j/j3;->b:Lm/b/j/s0;

    invoke-virtual {p1}, Lm/b/j/s0;->a()V

    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Lm/b/j/g0;->i()Lm/b/j/g0;

    .line 15
    iget-object p1, p0, Lm/b/j/j3;->b:Lm/b/j/s0;

    invoke-virtual {p1}, Lm/b/j/s0;->a()V

    :cond_1
    :goto_0
    return-object v1
.end method

.method public b()Lm/b/j/e0;
    .locals 1

    .line 1
    sget-object v0, Lm/b/j/e0;->c:Lm/b/j/e0;

    return-object v0
.end method

.method public b(Lm/b/i/l;)V
    .locals 1

    .line 6
    invoke-virtual {p0, p1}, Lm/b/j/b;->b(Lm/b/i/t;)V

    .line 7
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lm/b/i/t;)V
    .locals 1

    .line 16
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 17
    iget-object v0, p0, Lm/b/j/j3;->c:Lm/b/i/i;

    invoke-virtual {v0, p1}, Lm/b/i/l;->f(Lm/b/i/t;)Lm/b/i/l;

    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lm/b/j/b;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19
    invoke-virtual {p0, p1}, Lm/b/j/b;->a(Lm/b/i/t;)V

    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p0}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm/b/i/l;->f(Lm/b/i/t;)Lm/b/i/l;

    .line 21
    :goto_0
    instance-of v0, p1, Lm/b/i/l;

    if-eqz v0, :cond_2

    check-cast p1, Lm/b/i/l;

    invoke-virtual {p1}, Lm/b/i/l;->B()Lm/b/j/g0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/j/g0;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 22
    iget-object v0, p0, Lm/b/j/b;->o:Lm/b/i/q;

    if-eqz v0, :cond_2

    .line 23
    invoke-virtual {v0, p1}, Lm/b/i/q;->b(Lm/b/i/l;)Lm/b/i/q;

    :cond_2
    return-void
.end method

.method public b(Lm/b/j/b0;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lm/b/j/b;->k:Lm/b/j/b0;

    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 25
    iput-boolean p1, p0, Lm/b/j/b;->u:Z

    return-void
.end method

.method public final b(Lm/b/i/l;Lm/b/i/l;)Z
    .locals 2

    .line 26
    invoke-virtual {p1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    invoke-virtual {p1}, Lm/b/i/t;->a()Lm/b/i/b;

    move-result-object p1

    invoke-virtual {p2}, Lm/b/i/t;->a()Lm/b/i/b;

    move-result-object p2

    invoke-virtual {p1, p2}, Lm/b/i/b;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b([Ljava/lang/String;)Z
    .locals 2

    .line 24
    sget-object v0, Lm/b/j/b;->x:[Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lm/b/j/b;->a([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    :goto_0
    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p0}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 6
    invoke-virtual {p0}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lm/b/j/b;->C:[Ljava/lang/String;

    invoke-static {v0, v1}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {p0}, Lm/b/j/b;->w()Lm/b/i/l;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Lm/b/i/l;Lm/b/i/l;)V
    .locals 1

    .line 9
    iget-object v0, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {p0, v0, p1, p2}, Lm/b/j/b;->a(Ljava/util/ArrayList;Lm/b/i/l;Lm/b/i/l;)V

    return-void
.end method

.method public varargs c([Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 2
    iget-object v1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/l;

    .line 3
    iget-object v2, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 4
    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public c(Lm/b/i/l;)Z
    .locals 1

    .line 8
    iget-object v0, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {p0, v0, p1}, Lm/b/j/b;->a(Ljava/util/ArrayList;Lm/b/i/l;)Z

    move-result p1

    return p1
.end method

.method public d(Ljava/lang/String;)Lm/b/i/l;
    .locals 3

    .line 6
    iget-object v0, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_2

    .line 7
    iget-object v1, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/l;

    if-nez v1, :cond_0

    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v1

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public d()V
    .locals 1

    .line 4
    :cond_0
    iget-object v0, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    invoke-virtual {p0}, Lm/b/j/b;->y()Lm/b/i/l;

    move-result-object v0

    if-nez v0, :cond_0

    :cond_1
    return-void
.end method

.method public d(Lm/b/i/l;Lm/b/i/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {p0, v0, p1, p2}, Lm/b/j/b;->a(Ljava/util/ArrayList;Lm/b/i/l;Lm/b/i/l;)V

    return-void
.end method

.method public d(Lm/b/i/l;)Z
    .locals 1

    .line 2
    invoke-virtual {p1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object p1

    .line 3
    sget-object v0, Lm/b/j/b;->D:[Ljava/lang/String;

    invoke-static {p1, v0}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public e(Ljava/lang/String;)Lm/b/i/l;
    .locals 3

    .line 7
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 8
    iget-object v1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/l;

    .line 9
    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public e()V
    .locals 3

    const-string v0, "tbody"

    const-string v1, "tfoot"

    const-string v2, "thead"

    .line 10
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm/b/j/b;->a([Ljava/lang/String;)V

    return-void
.end method

.method public e(Lm/b/i/l;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm/b/j/b;->m:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "href"

    .line 2
    invoke-virtual {p1, v0}, Lm/b/i/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iput-object p1, p0, Lm/b/j/j3;->e:Ljava/lang/String;

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lm/b/j/b;->m:Z

    .line 6
    iget-object v0, p0, Lm/b/j/j3;->c:Lm/b/i/i;

    invoke-virtual {v0, p1}, Lm/b/i/t;->d(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public f()V
    .locals 1

    const-string v0, "table"

    .line 2
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm/b/j/b;->a([Ljava/lang/String;)V

    return-void
.end method

.method public f(Ljava/lang/String;)Z
    .locals 1

    .line 3
    sget-object v0, Lm/b/j/b;->z:[Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lm/b/j/b;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public f(Lm/b/i/l;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {p0, v0, p1}, Lm/b/j/b;->a(Ljava/util/ArrayList;Lm/b/i/l;)Z

    move-result p1

    return p1
.end method

.method public g()V
    .locals 1

    const-string v0, "tr"

    .line 2
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm/b/j/b;->a([Ljava/lang/String;)V

    return-void
.end method

.method public g(Lm/b/i/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g(Ljava/lang/String;)Z
    .locals 1

    .line 3
    sget-object v0, Lm/b/j/b;->y:[Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lm/b/j/b;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public h(Lm/b/i/l;)V
    .locals 3

    .line 3
    iget-object v0, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-ltz v0, :cond_3

    .line 4
    iget-object v2, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm/b/i/l;

    if-nez v2, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    invoke-virtual {p0, p1, v2}, Lm/b/j/b;->b(Lm/b/i/l;Lm/b/i/l;)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    :cond_1
    const/4 v2, 0x3

    if-ne v1, v2, :cond_2

    .line 6
    iget-object v1, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 7
    :cond_3
    :goto_1
    iget-object v0, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm/b/j/b;->t:Z

    return v0
.end method

.method public h(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lm/b/j/b;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public i()V
    .locals 1

    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Lm/b/j/b;->c(Ljava/lang/String;)V

    return-void
.end method

.method public i(Lm/b/i/l;)V
    .locals 2

    .line 8
    iget-object v0, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 9
    iget-object v1, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/l;

    if-ne v1, p1, :cond_0

    .line 10
    iget-object p1, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public i(Ljava/lang/String;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_2

    .line 2
    iget-object v2, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm/b/i/l;

    .line 3
    invoke-virtual {v2}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return v1

    .line 5
    :cond_0
    sget-object v3, Lm/b/j/b;->B:[Ljava/lang/String;

    invoke-static {v2, v3}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    const-string p1, "Should not be reachable"

    .line 6
    invoke-static {p1}, Lm/b/h/j;->a(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/j3;->e:Ljava/lang/String;

    return-object v0
.end method

.method public j(Ljava/lang/String;)Z
    .locals 2

    .line 5
    sget-object v0, Lm/b/j/b;->A:[Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lm/b/j/b;->a(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public j(Lm/b/i/l;)Z
    .locals 3

    .line 2
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    .line 3
    iget-object v2, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm/b/i/l;

    if-ne v2, p1, :cond_0

    .line 4
    iget-object p1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public k()Lm/b/i/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/j3;->c:Lm/b/i/i;

    return-object v0
.end method

.method public k(Ljava/lang/String;)Lm/b/i/l;
    .locals 2

    .line 2
    new-instance v0, Lm/b/i/l;

    iget-object v1, p0, Lm/b/j/j3;->h:Lm/b/j/e0;

    invoke-static {p1, v1}, Lm/b/j/g0;->a(Ljava/lang/String;Lm/b/j/e0;)Lm/b/j/g0;

    move-result-object p1

    iget-object v1, p0, Lm/b/j/j3;->e:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lm/b/i/l;-><init>(Lm/b/j/g0;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0, v0}, Lm/b/j/b;->b(Lm/b/i/l;)V

    return-object v0
.end method

.method public k(Lm/b/i/l;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lm/b/j/b;->n:Lm/b/i/l;

    return-void
.end method

.method public l()Lm/b/i/q;
    .locals 1

    .line 5
    iget-object v0, p0, Lm/b/j/b;->o:Lm/b/i/q;

    return-object v0
.end method

.method public l(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 2
    iget-object v1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/l;

    .line 3
    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    iget-object v1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public m()Lm/b/i/l;
    .locals 1

    .line 5
    iget-object v0, p0, Lm/b/j/b;->n:Lm/b/i/l;

    return-object v0
.end method

.method public m(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 2
    iget-object v1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/l;

    .line 3
    iget-object v2, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 4
    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public n()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lm/b/j/b;->r:Ljava/util/List;

    return-object v0
.end method

.method public o()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lm/b/i/l;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method public p()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm/b/j/b;->u:Z

    return v0
.end method

.method public r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm/b/j/b;->v:Z

    return v0
.end method

.method public s()Lm/b/i/l;
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b/i/l;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public t()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/b;->k:Lm/b/j/b0;

    iput-object v0, p0, Lm/b/j/b;->l:Lm/b/j/b0;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TreeBuilder{currentToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm/b/j/j3;->f:Lm/b/j/q0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm/b/j/b;->k:Lm/b/j/b0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentElement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lm/b/j/b;->r:Ljava/util/List;

    return-void
.end method

.method public v()Lm/b/j/b0;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/b;->l:Lm/b/j/b0;

    return-object v0
.end method

.method public w()Lm/b/i/l;
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 2
    iget-object v1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b/i/l;

    return-object v0
.end method

.method public x()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lm/b/j/b;->s()Lm/b/i/l;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 2
    invoke-virtual {p0, v0}, Lm/b/j/b;->f(Lm/b/i/l;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    iget-object v1, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    move v3, v1

    :cond_1
    const/4 v4, 0x0

    if-nez v3, :cond_2

    goto :goto_0

    .line 4
    :cond_2
    iget-object v0, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b/i/l;

    if-eqz v0, :cond_3

    .line 5
    invoke-virtual {p0, v0}, Lm/b/j/b;->f(Lm/b/i/l;)Z

    move-result v5

    if-eqz v5, :cond_1

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_4

    .line 6
    iget-object v0, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b/i/l;

    .line 7
    :cond_4
    invoke-static {v0}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 8
    invoke-virtual {v0}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lm/b/j/b;->k(Ljava/lang/String;)Lm/b/i/l;

    move-result-object v2

    .line 9
    invoke-virtual {v2}, Lm/b/i/t;->a()Lm/b/i/b;

    move-result-object v5

    invoke-virtual {v0}, Lm/b/i/t;->a()Lm/b/i/b;

    move-result-object v6

    invoke-virtual {v5, v6}, Lm/b/i/b;->a(Lm/b/i/b;)V

    .line 10
    iget-object v5, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {v5, v3, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    if-ne v3, v1, :cond_3

    :cond_5
    :goto_1
    return-void
.end method

.method public y()Lm/b/i/l;
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v1, p0, Lm/b/j/b;->q:Ljava/util/ArrayList;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b/i/l;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public z()V
    .locals 5

    .line 1
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    :goto_0
    if-ltz v0, :cond_f

    .line 2
    iget-object v3, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm/b/i/l;

    if-nez v0, :cond_0

    .line 3
    iget-object v3, p0, Lm/b/j/b;->p:Lm/b/i/l;

    const/4 v2, 0x1

    .line 4
    :cond_0
    invoke-virtual {v3}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v3

    const-string v4, "select"

    .line 5
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 6
    sget-object v0, Lm/b/j/b0;->q:Lm/b/j/b0;

    invoke-virtual {p0, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto/16 :goto_3

    :cond_1
    const-string v4, "td"

    .line 7
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    const-string v4, "th"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    if-nez v2, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "tr"

    .line 8
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 9
    sget-object v0, Lm/b/j/b0;->o:Lm/b/j/b0;

    invoke-virtual {p0, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto/16 :goto_3

    :cond_3
    const-string v4, "tbody"

    .line 10
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    const-string v4, "thead"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    const-string v4, "tfoot"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_1

    :cond_4
    const-string v4, "caption"

    .line 11
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 12
    sget-object v0, Lm/b/j/b0;->l:Lm/b/j/b0;

    invoke-virtual {p0, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto/16 :goto_3

    :cond_5
    const-string v4, "colgroup"

    .line 13
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 14
    sget-object v0, Lm/b/j/b0;->m:Lm/b/j/b0;

    invoke-virtual {p0, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto :goto_3

    :cond_6
    const-string v4, "table"

    .line 15
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 16
    sget-object v0, Lm/b/j/b0;->j:Lm/b/j/b0;

    invoke-virtual {p0, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto :goto_3

    :cond_7
    const-string v4, "head"

    .line 17
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 18
    sget-object v0, Lm/b/j/b0;->h:Lm/b/j/b0;

    invoke-virtual {p0, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto :goto_3

    :cond_8
    const-string v4, "body"

    .line 19
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    .line 20
    sget-object v0, Lm/b/j/b0;->h:Lm/b/j/b0;

    invoke-virtual {p0, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto :goto_3

    :cond_9
    const-string v4, "frameset"

    .line 21
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    .line 22
    sget-object v0, Lm/b/j/b0;->t:Lm/b/j/b0;

    invoke-virtual {p0, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto :goto_3

    :cond_a
    const-string v4, "html"

    .line 23
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 24
    sget-object v0, Lm/b/j/b0;->d:Lm/b/j/b0;

    invoke-virtual {p0, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto :goto_3

    :cond_b
    if-eqz v2, :cond_c

    .line 25
    sget-object v0, Lm/b/j/b0;->h:Lm/b/j/b0;

    invoke-virtual {p0, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto :goto_3

    :cond_c
    add-int/lit8 v0, v0, -0x1

    goto/16 :goto_0

    .line 26
    :cond_d
    :goto_1
    sget-object v0, Lm/b/j/b0;->n:Lm/b/j/b0;

    invoke-virtual {p0, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto :goto_3

    .line 27
    :cond_e
    :goto_2
    sget-object v0, Lm/b/j/b0;->p:Lm/b/j/b0;

    invoke-virtual {p0, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    :cond_f
    :goto_3
    return-void
.end method
