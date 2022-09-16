import { postFreeBoard } from '@apis/index';
import { BoardHeader, TopNav } from '@components/index';
import { useState } from 'react';
import * as S from './style';

export default function BoardWrite() {
  const [form, setForm] = useState({
    title: '',
    content: '',
  });

  return (
    <>
      <TopNav />
      <div style={{ height: '10rem' }} />
      <S.Container>
        <BoardHeader title={'자유게시판'} />
        <S.Main>
          <label>제목</label>
          <input
            type="text"
            value={form.title}
            onChange={(e) => setForm({ ...form, title: e.target.value })}
          />
          <label>내용</label>
          <textarea
            value={form.content}
            onChange={(e) => setForm({ ...form, content: e.target.value })}
          />
          <button onClick={() => postFreeBoard(form)}>등록</button>
        </S.Main>
      </S.Container>
    </>
  );
}
